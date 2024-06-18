package com.keyin.rest.aircraft;

//import com.keyin.rest.seat.Seat;

public class Aircraft {
    long aircraft_ID;
    String model;
    String manufacturer;
    String airline;
    int capacity;
    //Seat[][] seatingChart;



    public Aircraft(long aircraft_ID, String model, String manufacturer, String airline, int capacity) {
        this.aircraft_ID = aircraft_ID;
        this.model = model;
        this.manufacturer = manufacturer;
        this.airline = airline;
        this.capacity = capacity;
        //this.seatingChart = seatingChart; // Initialize the new field
    }

    public long getAircraft_ID() {
        return aircraft_ID;
    }

    public void setAircraft_ID(long aircraft_ID) {
        this.aircraft_ID = aircraft_ID;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
/*
    public Seat[][] getSeatingChart() {
        return seatingChart;
    }

    public void setSeatingChart(Seat[][] seatingChart) {
        this.seatingChart = seatingChart;
    }
 */
}
