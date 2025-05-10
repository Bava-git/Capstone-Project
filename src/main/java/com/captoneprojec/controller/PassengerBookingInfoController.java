package com.captoneprojec.controller;

import com.captoneprojec.entity.Bus;
import com.captoneprojec.entity.PassengerBookingInfo;
import com.captoneprojec.entity.PassengerBookingInfo;
import com.captoneprojec.service.PassengerBookingInfoService;
import com.captoneprojec.service.PassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/passengerbookingInfo")
@CrossOrigin("http://localhost:3000")
public class PassengerBookingInfoController {

    @Autowired
    private PassengerBookingInfoService passengerBookInfoSer;

    @GetMapping
    public List<PassengerBookingInfo> listPBIR() {
        return passengerBookInfoSer.listPBIR();
    }

    @GetMapping("/id/{passengerBookingInfoId}")
    public ResponseEntity<?> findByPassengerBookingInfoId(@PathVariable String passengerBookingInfoId) {
        PassengerBookingInfo passengerBookingInfo =
                passengerBookInfoSer.findByPassengerBookingInfoId(passengerBookingInfoId);
        if (passengerBookingInfo != null) {
            return ResponseEntity.ok(passengerBookingInfo); // 200 OK
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("PassengerBookingInfo not found, " + passengerBookingInfoId); // 404 NOT_FOUND
        }
    }

    @GetMapping("/subid/{passengerId}")
    public ResponseEntity<?> findByPassengerId(@PathVariable String passengerId) {
        PassengerBookingInfo passengerBookingInfo = passengerBookInfoSer.findByPassengerId(passengerId);
        if (passengerBookingInfo != null) {
            return ResponseEntity.ok(passengerBookingInfo); // 200 OK
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("PassengerBookingInfo not found, " + passengerId); // 404 NOT_FOUND
        }
    }

    @PostMapping("/add")
    public ResponseEntity<?> createPBIR(@RequestBody PassengerBookingInfo passengerBookingInfo) {

        PassengerBookingInfo isExist =
                passengerBookInfoSer.findByPassengerBookingInfoId(passengerBookingInfo.getPassengerBookingInfoId());
        if (isExist != null) {
            return ResponseEntity.status(HttpStatus.FOUND).body("ID already exist " +
                    passengerBookingInfo.getPassengerBookingInfoId());
        }

        PassengerBookingInfo pass = passengerBookInfoSer.createPBIR(passengerBookingInfo);
        if (pass != null) {
            return ResponseEntity.status(HttpStatus.CREATED).body(pass);
        }
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
    }

    @PutMapping("/update/{passengerBookingInfoId}")
    public ResponseEntity<?> updatePBIR(@PathVariable String passengerBookingInfoId,
                                        @RequestBody PassengerBookingInfo updatepassengerBookingInfo) {
        PassengerBookingInfo pat = passengerBookInfoSer.updatePBIR(passengerBookingInfoId, updatepassengerBookingInfo);
        if (pat != null) {
            return ResponseEntity.status(HttpStatus.OK).body("Updated successfully."); // 200 OK
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("PassengerBookingInfo not found, " + passengerBookingInfoId); // 404 NOT_FOUND
    }

    @Transactional
    @DeleteMapping("/delete/{passengerBookingInfoId}")
    public ResponseEntity<?> deletePBIR(@PathVariable String passengerBookingInfoId) {
        int isDeleted = passengerBookInfoSer.deletePBIR(passengerBookingInfoId);
        if (isDeleted > 0) {
            return ResponseEntity.status(HttpStatus.OK).body("Deleted successfully"); // 200 OK
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("PassengerBookingInfo not found, " + passengerBookingInfoId); // 404 NOT_FOUND
        }
    }


}
