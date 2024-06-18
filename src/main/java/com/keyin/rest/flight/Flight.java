package com.keyin.rest.flight;

import com.keyin.rest.airport.Airport;
import com.keyin.rest.aircraft.Aircraft;
import com.keyin.rest.city.City;

import java.time.LocalDateTime;

public class Flight {
    private long flight_ID;
    private String flight_number;
    private Airport departure;
    private Airport arrival;
    private Aircraft aircraft;
    private LocalDateTime departure_time;
    private LocalDateTime arrival_time;
    private Status status;

    public Flight(long flight_ID, String flight_number, Airport departure, Airport arrival, Aircraft aircraft, LocalDateTime departure_time, LocalDateTime arrival_time, Status status) {
        this.flight_ID = flight_ID;
        this.flight_number = flight_number;
        this.departure = departure;
        this.arrival = arrival;
        this.aircraft = aircraft;
        this.departure_time = departure_time;
        this.arrival_time = arrival_time;
        this.status = status;
    }

    // Getters and Setters
    public long getFlight_ID() {
        return flight_ID;
    }

    public void setFlight_ID(long flight_ID) {
        this.flight_ID = flight_ID;
    }

    public String getFlight_number() {
        return flight_number;
    }

    public void setFlight_number(String flight_number) {
        this.flight_number = flight_number;
    }

    public Airport getDeparture() {
        return departure;
    }

    public void setDeparture(Airport departure) {
        this.departure = departure;
    }

    public Airport getArrival() {
        return arrival;
    }

    public void setArrival(Airport arrival) {
        this.arrival = arrival;
    }

    public Aircraft getAircraft() {
        return aircraft;
    }

    public void setAircraft(Aircraft aircraft) {
        this.aircraft = aircraft;
    }

    public LocalDateTime getDeparture_time() {
        return departure_time;
    }

    public void setDeparture_time(LocalDateTime departure_time) {
        this.departure_time = departure_time;
    }

    public LocalDateTime getArrival_time() {
        return arrival_time;
    }

    public void setArrival_time(LocalDateTime arrival_time) {
        this.arrival_time = arrival_time;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    // Enum for flight status
    public enum Status {
        ON_TIME, DELAYED, CANCELED
    }
}
