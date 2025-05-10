package com.captoneprojec.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "bookinginfodb")
public class BookingInfo {

    @Id
    @Column(name = "bookingInfo_id")
    @JsonProperty("bookingInfo_id")
    private String bookingInfoId;

    @Column(name = "booking_date")
    @JsonProperty("booking_date")
    private LocalDate bookingDate;

    @Column(name = "start_time")
    @JsonProperty("start_time")
    private LocalTime startTime;

    @Column(name = "end_time")
    @JsonProperty("end_time")
    private LocalTime endTime;

    @Column(name = "bus_id")
    @JsonProperty("bus_id")
    private String busId;

    @Column(name = "routeInfo_id")
    @JsonProperty("routeInfo_id")
    private String routeInfoId;

    @Column(name = "origin")
    @JsonProperty("origin")
    private String origin;

    @Column(name = "destination")
    @JsonProperty("destination")
    @NotBlank
    private String destination;

    @Column(name = "total_distance")
    @JsonProperty("total_distance")
    private int totalDistance;
}
