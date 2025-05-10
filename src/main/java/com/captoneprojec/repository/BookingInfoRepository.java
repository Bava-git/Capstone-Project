package com.captoneprojec.repository;

import com.captoneprojec.entity.BookingInfo;
import com.captoneprojec.entity.PassengerBookingInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookingInfoRepository extends JpaRepository<BookingInfo, Long> {
    BookingInfo findByBookingInfoId(String bookingInfoId);

    List<BookingInfo> findByBusId(String busId);

    List<BookingInfo> findByRouteInfoId(String routeInfoId);

    int deleteByBookingInfoId(String bookingInfoId);

}
