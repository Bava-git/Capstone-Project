package com.captoneprojec.repository;

import com.captoneprojec.entity.PassengerCredential;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PassengerCredentialRep extends JpaRepository<PassengerCredential, Long> {
    PassengerCredential findByPassengerCredentialId(long passengerCredentialId);

    PassengerCredential findByPassengerId(String passengerId);

    int deleteByPassengerCredentialId(long passengerCredentialId);

    int deleteByPassengerId(String passengerId);
}
