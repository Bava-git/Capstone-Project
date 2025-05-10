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

import java.time.LocalTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "routeinfodb")
public class RouteInfo {

    @Id
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

    @Column(name = "distance")
    @JsonProperty("distance")
    private int distance;

    @Column(name = "travel_time")
    @JsonProperty("travel_time")
    private LocalTime travelTime;
}
