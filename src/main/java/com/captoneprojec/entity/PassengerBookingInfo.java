package com.captoneprojec.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "passengerbookinginfodb")
public class PassengerBookingInfo {

    @Id
    @Column(name = "passengerBookingInfo_id")
    @JsonProperty("passengerBookingInfo_id")
    private String passengerBookingInfoId;

    @Column(name = "passenger_id")
    @JsonProperty("passenger_id")
    private String passengerId;

    @Column(name = "passenger_name")
    @JsonProperty("passenger_name")
    @NotBlank
    @Size(min = 3, max = 30)
    private String passengerName;
}
