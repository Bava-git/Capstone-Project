package com.captoneprojec.service;

import com.captoneprojec.entity.Passenger;
import com.captoneprojec.repository.PassengerBookingInfoRep;
import com.captoneprojec.repository.PassengerCredentialRep;
import com.captoneprojec.repository.PassengerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PassengerService {

    @Autowired
    private PassengerRepository passengerRepository;
    @Autowired
    private PassengerCredentialRep passengerCredentialRep;
    @Autowired
    private PassengerBookingInfoRep passengerBookingInfoRep;

    public List<Passenger> listPassenger() {
        return passengerRepository.findAll();
    }

    public Passenger findByPassengerId(String passengerId) {
        return passengerRepository.findByPassengerId(passengerId);
    }

    public Passenger findByPassengerEmail(String passengerEmail) {
        return passengerRepository.findByPassengerEmail(passengerEmail);
    }

    public Passenger findByPassengerMobile(String passengerMobile) {
        return passengerRepository.findByPassengerMobile(passengerMobile);
    }

    public Passenger createPassenger(Passenger passenger) {
        return passengerRepository.save(passenger);
    }

    public Passenger updatePassenger(String passengerId, Passenger updatePassenger) {
        Passenger existPassenger = passengerRepository.findByPassengerId(passengerId);

        if (existPassenger != null) {
            existPassenger.setPassengerName(updatePassenger.getPassengerName());
            existPassenger.setPassengerAge(updatePassenger.getPassengerAge());
            existPassenger.setPassengerEmail(updatePassenger.getPassengerEmail());
            existPassenger.setPassengerMobile(updatePassenger.getPassengerMobile());
            existPassenger.setPassengerGender(updatePassenger.getPassengerGender());
            existPassenger.setPassengerSecretCode(updatePassenger.getPassengerSecretCode());
            return passengerRepository.save(existPassenger);
        }

        return null;
    }

    public int deletePassenger(String passengerId) {
        int i = 0;
        i = i + passengerCredentialRep.deleteByPassengerId(passengerId);
        i = i + passengerBookingInfoRep.deleteByPassengerId(passengerId);
        i = i + passengerRepository.deleteByPassengerId(passengerId);
        return i;
    }

}
