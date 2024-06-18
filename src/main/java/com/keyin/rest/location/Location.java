package com.keyin.rest.location;

import com.keyin.rest.airport.Airport;

public class Location {
    private long location_ID;
    private String city;
    private String province;
    private Airport airport;

    public Location(long location_ID, String city, String province, Airport airport) {
        this.location_ID = location_ID;
        this.city = city;
        this.province = province;
        this.airport = airport;
    }

    public long getLocation_ID() {
        return location_ID;
    }

    public void setLocation_ID(long location_ID) {
        this.location_ID = location_ID;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public Airport getAirport() {
        return airport;
    }

    public void setAirport(Airport airport) {
        this.airport = airport;
    }
}


