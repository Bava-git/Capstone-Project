package com.captoneprojec.controller;

import com.captoneprojec.entity.PassengerCredential;
import com.captoneprojec.repository.PassengerCredentialRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/passengercredential")
@CrossOrigin("http://localhost:3000")
public class PassengerCredentialController {

    @Autowired
    private PassengerCredentialRep passengerCredentialRepository;

    @PostMapping("/login")
    public void PassengerLogin(@RequestBody PassengerCredential passengerCredential){

    }


}
