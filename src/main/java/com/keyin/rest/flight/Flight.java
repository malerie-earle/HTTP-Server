package com.keyin.rest.flight;

import com.keyin.rest.airport.Airport;
import com.keyin.rest.aircraft.Aircraft;
import com.keyin.rest.booking.Booking;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Flight {
    private long flight_ID;
    private Airport origin;
    private Airport destination;
    private Aircraft aircraft;
    private String departure_time;
    private String arrival_time;
    private Status status; // Enum or string
    private Booking[][] bookings;

    public Flight(long flight_ID, Airport origin, Airport destination, Aircraft aircraft, String departure_time, String arrival_time, Status status) {
        this.flight_ID = flight_ID;
        this.origin = origin;
        this.destination = destination;
        this.aircraft = aircraft;
        this.departure_time = departure_time;
        this.arrival_time = arrival_time;
        this.status = status;
        this.bookings = new Booking[aircraft.getRows()][aircraft.getColumns()];
    }

    // Getters and Setters
    public long getFlight_ID() {
        return flight_ID;
    }

    public void setFlight_ID(long flight_ID) {
        this.flight_ID = flight_ID;
    }


    public Airport getOrigin() {
        return origin;
    }

    public void setOrigin(Airport origin) {
        this.origin = origin;
    }

    public Airport getDestination() {
        return destination;
    }

    public void setDestination(Airport destination) {
        this.destination = destination;
    }

    public Aircraft getAircraft() {
        return aircraft;
    }

    public void setAircraft(Aircraft aircraft) {
        this.aircraft = aircraft;
    }

    public String getDeparture_time() {
        return departure_time;
    }

    public void setDeparture_time(String departure_time) {
        this.departure_time = departure_time;
    }

    public String getArrival_time() {
        return arrival_time;
    }

    public void setArrival_time(String arrival_time) {
        this.arrival_time = arrival_time;
    }

    public void setBookings(Booking[][] bookings) {
        this.bookings = bookings;
    }

    public Booking[][] getBookings() {
        return bookings;
    }

    public Long calcululateFlightDuration(){
        return LocalDateTime.parse(departure_time).until(LocalDateTime.parse(arrival_time), ChronoUnit.MINUTES);
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

    public boolean isOccupied(int row, int col){
        return bookings[row-1][col-1] != null;
    }

    public void setSeat(int row, int col, Booking booking){
        bookings[row-1][col-1] = booking;
    }


}
