package com.captoneprojec.service;

import com.captoneprojec.entity.BusSeatBooking;
import com.captoneprojec.repository.BusSeatBookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BusSeatBookingService {

    @Autowired
    private BusSeatBookingRepository bookingInfoRepository;

    public List<BusSeatBooking> listBBIR() {
        return bookingInfoRepository.findAll();
    }

    public BusSeatBooking findByBusBookingInfoId(String busId) {
        return bookingInfoRepository.findByBusBookingInfoId(busId);
    }

    public List<BusSeatBooking> findByBusId(String busId) {
        return bookingInfoRepository.findByBusId(busId);
    }

    public BusSeatBooking createBBIR(BusSeatBooking busBookingInfo) {
        return bookingInfoRepository.save(busBookingInfo);
    }

    public BusSeatBooking updateBBIR(String busId, BusSeatBooking updatebusBookingInfo) {
        BusSeatBooking existBus = bookingInfoRepository.findByBusBookingInfoId(busId);

        if (existBus != null) {
            existBus.setBusBookingInfoId((updatebusBookingInfo.getBusBookingInfoId()));
            existBus.setBusId(updatebusBookingInfo.getBusId());
            existBus.setBookingDate(updatebusBookingInfo.getBookingDate());
            existBus.setPassengerGender(updatebusBookingInfo.getPassengerGender());
            existBus.setBookedSeatNum(updatebusBookingInfo.getBookedSeatNum());
            return bookingInfoRepository.save(updatebusBookingInfo);
        }

        return null;
    }

    public int deleteAllByBusId(String busId) {
        return bookingInfoRepository.deleteAllByBusId(busId);
    }

    public int deleteByBusBookingInfoId(String BusBookingInfoId) {
        return bookingInfoRepository.deleteByBusBookingInfoId(BusBookingInfoId);
    }

}
