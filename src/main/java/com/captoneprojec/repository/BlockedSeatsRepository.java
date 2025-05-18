package com.captoneprojec.repository;

import com.captoneprojec.entity.BlockedSeats;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BlockedSeatsRepository extends JpaRepository<BlockedSeats, Long> {

    BlockedSeats findByBusBookingInfoId(String busId);

    List<BlockedSeats> findByBusId(String busId);

    int deleteAllByBusId(String busId);

    int deleteByBusBookingInfoId(String busBookingInfoId);
}
