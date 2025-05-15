package com.captoneprojec.repository;

import com.captoneprojec.entity.BusSeatBooking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BusSeatBookingRepository extends JpaRepository<BusSeatBooking, Long> {

    BusSeatBooking findByBusBookingInfoId(String busId);

    List<BusSeatBooking> findByBusId(String busId);

    int deleteAllByBusId(String busId);

    int deleteByBusBookingInfoId(String busBookingInfoId);
}
