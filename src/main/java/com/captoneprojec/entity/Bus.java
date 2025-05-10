package com.captoneprojec.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "busdb")
public class Bus {

    @Id
    @Column(name = "bus_id")
    @JsonProperty("bus_id")
    private String busId;

    @Column(name = "bus_name")
    @JsonProperty("bus_name")
    private String busName;

    @Column(name = "bus_operator")
    @JsonProperty("bus_operator")
    private String busOperator;

    @Column(name = "isACBus")
    @JsonProperty("isACBus")
    private boolean isACBus;

    @Column(name = "isSleeper")
    @JsonProperty("isSleeper")
    private boolean isSleeper;

    @Column(name = "isLiveTrackable")
    @JsonProperty("isLiveTrackable")
    private boolean isLiveTrackable;

    @Column(name = "ratePerKm")
    @JsonProperty("ratePerKm")
    private double ratePerKm;

    @Column(name = "waterBottle")
    @JsonProperty("waterBottle")
    private boolean waterBottle;

    @Column(name = "blanket")
    @JsonProperty("blanket")
    private boolean blanket;

    @Column(name = "chargingPoint")
    @JsonProperty("chargingPoint")
    private boolean chargingPoint;

    @Column(name = "toilet")
    @JsonProperty("toilet")
    private boolean toilet;
}
