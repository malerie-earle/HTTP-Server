package com.keyin.rest.city;

import com.keyin.rest.airport.Airport;

public class City {
    private long city_ID;
    private String name;
    private String province;
    private Airport airport;

    public City(long city_ID, String name, String province, Airport airport) {
        this.city_ID = city_ID;
        this.name = name;
        this.province = province;
        this.airport = airport;
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

    public Airport getAirport() {
        return airport;
    }

    public void setAirport(Airport airport) {
        this.airport = airport;
    }
}


