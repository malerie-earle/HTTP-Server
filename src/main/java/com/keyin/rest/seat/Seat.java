package com.keyin.rest.seat;

import com.keyin.rest.aircraft.Aircraft;
import com.keyin.rest.flight.Flight;
import com.keyin.rest.passenger.Passenger;


public class Seat {
    long seat_ID;
    String seat_number;
    String seat_class;
    Passenger passenger;
    Flight flight;
    Aircraft aircraft;

    public Seat(long seat_ID, String seat_number, String seat_class, Passenger passenger, Flight flight, Aircraft aircraft) {
        this.seat_ID = seat_ID;
        this.seat_number = seat_number;
        this.seat_class = seat_class;
        this.passenger = passenger;
        this.flight = flight;
        this.aircraft = aircraft;
    }

    // Getters and Setters
    public long getSeat_ID() {
        return seat_ID;
    }

    public void setSeat_ID(long seat_ID) {
        this.seat_ID = seat_ID;
    }

    public String getSeat_number() {
        return seat_number;
    }

    public void setSeat_number(String seat_number) {
        this.seat_number = seat_number;
    }

    public String getSeat_class() {
        return seat_class;
    }

    public void setSeat_class(String seat_class) {
        this.seat_class = seat_class;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public Aircraft getAircraft() {
        return aircraft;
    }

    public void setAircraft(Aircraft aircraft) {
        this.aircraft = aircraft;
    }
}
