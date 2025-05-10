package com.captoneprojec.service;

import com.captoneprojec.entity.PassengerBookingInfo;
import com.captoneprojec.repository.PassengerBookingInfoRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PassengerBookingInfoService {

    @Autowired
    private PassengerBookingInfoRep passengerBookInfoRep;

    public List<PassengerBookingInfo> listPBIR() {
        return passengerBookInfoRep.findAll();
    }

    public PassengerBookingInfo findByPassengerId(String passengerId) {
        return passengerBookInfoRep.findByPassengerId(passengerId);
    }

    public PassengerBookingInfo findByPassengerBookingInfoId(String passengerBookingInfoId) {
        return passengerBookInfoRep.findByPassengerBookingInfoId(passengerBookingInfoId);
    }

    public PassengerBookingInfo createPBIR(PassengerBookingInfo passengerBookingInfo) {
        return passengerBookInfoRep.save(passengerBookingInfo);
    }

    public PassengerBookingInfo updatePBIR(String passengerBookingInfoId,
                                                PassengerBookingInfo UpdatepassengerBookingInfo) {
        PassengerBookingInfo ifExist = passengerBookInfoRep.
                findByPassengerBookingInfoId(passengerBookingInfoId);

        if (ifExist != null) {
            ifExist.setPassengerId(UpdatepassengerBookingInfo.getPassengerId());
            ifExist.setPassengerName(UpdatepassengerBookingInfo.getPassengerName());
            passengerBookInfoRep.save(UpdatepassengerBookingInfo);
        }

        return null;
    }

    public int deletePBIR(String passengerBookingInfoId) {
        return passengerBookInfoRep.deleteByPassengerBookingInfoId(passengerBookingInfoId);
    }
}
