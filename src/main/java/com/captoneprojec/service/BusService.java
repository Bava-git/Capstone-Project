package com.captoneprojec.service;

import com.captoneprojec.entity.Bus;
import com.captoneprojec.repository.BusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BusService {

    @Autowired
    private BusRepository busRepository;

    public List<Bus> listBus() {
        return busRepository.findAll();
    }

    public Bus findByBusId(String busId) {
        return busRepository.findByBusId(busId);
    }

    public Bus createBus(Bus bus) {
        return busRepository.save(bus);
    }

    public Bus updateBus(String busId, Bus updateBus) {
        Bus existBus = busRepository.findByBusId(busId);

        if (existBus != null) {
//            existBus.setBusName(updateBus.getBusName());
//            existBus.setBusOperator(updateBus.getBusOperator());
//            existBus.setACBus(updateBus.isACBus());
//            existBus.setSleeper(updateBus.isSleeper());
//            existBus.setLiveTrackable(updateBus.isLiveTrackable());
//            existBus.setRatePerKm(updateBus.getRatePerKm());
//            existBus.setWaterBottle(updateBus.isWaterBottle());
//            existBus.setBlanket(updateBus.isBlanket());
//            existBus.setChargingPoint(updateBus.isChargingPoint());
//            existBus.setToilet(updateBus.isToilet());
//            return busRepository.save(updateBus);
        }

        return null;
    }

    public int deleteBus(String busId) {
        return busRepository.deleteByBusId(busId);
    }

}
