package com.captoneprojec.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
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
@Table(name = "passengercredential")
public class PassengerCredential {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long passengerCredentialId;

    @Column(name = "passenger_username")
    @JsonProperty("passenger_username")
    @NotBlank
    @Size(min = 3, max = 30)
    private String passengerUsername;

    @Column(name = "passenger_password")
    @JsonProperty("passenger_password")
    @NotBlank
    @Size(min = 4, max = 30)
    private String passengerPassword;

    @Column(name = "passenger_id")
    @JsonProperty("passenger_id")
    private String passengerId;
}
