package com.keyin.rest.city;

import com.keyin.rest.airport.Airport;

import java.util.ArrayList;

public class City {
    private long city_ID;
    private String name;
    private String province;
    private ArrayList<Airport> airports;

    public City(long city_ID, String name, String province, ArrayList<Airport> airports) {
        this.city_ID = city_ID;
        this.name = name;
        this.province = province;
        this.airports = airports;
    }

    public long getCity_ID() {
        return city_ID;
    }

    public void setCity_ID(long city_ID) {
        this.city_ID = city_ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public ArrayList<Airport> getAirports() {
        return airports;
    }

    public void setAirports(ArrayList<Airport> airports) {
        this.airports = airports;
    }
}


