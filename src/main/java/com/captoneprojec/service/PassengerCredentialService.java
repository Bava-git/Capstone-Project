package com.captoneprojec.service;

import com.captoneprojec.entity.PassengerCredential;
import com.captoneprojec.repository.PassengerCredentialRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PassengerCredentialService {

    @Autowired
    private PassengerCredentialRep passengerCredentialRepository;

    public List<PassengerCredential> listPCR() {
        return passengerCredentialRepository.findAll();
    }

    public PassengerCredential findByPassengerCredentialId(long passengerCredentialId) {
        return passengerCredentialRepository.findByPassengerCredentialId(passengerCredentialId);
    }

    public PassengerCredential findByPassengerId(String passengerId) {
        return passengerCredentialRepository.findByPassengerId(passengerId);
    }

    public PassengerCredential createPCR(PassengerCredential passengerCredential) {
        return passengerCredentialRepository.save(passengerCredential);
    }

    public PassengerCredential updatePCR(long passengerCredentialId,
                                               PassengerCredential updatepassengerCredential) {
        PassengerCredential existPassengerCredential =
                passengerCredentialRepository.findByPassengerCredentialId(passengerCredentialId);

        if (existPassengerCredential != null) {
            existPassengerCredential.setPassengerId(updatepassengerCredential.getPassengerId());
            existPassengerCredential.setPassengerUsername(updatepassengerCredential.getPassengerUsername());
            existPassengerCredential.setPassengerPassword(updatepassengerCredential.getPassengerPassword());
            passengerCredentialRepository.save(existPassengerCredential);
        }

        return null;
    }

    public int deletePCR(long passengerCredentialId) {
        return passengerCredentialRepository.deleteByPassengerCredentialId(passengerCredentialId);
    }
}
