package com.keyin.rest.airport;

public class Airport {
    private long airport_ID;
    private String code;
    private String name;
//    private String location;


    public Airport(long airport_ID, String code, String name, String location) {
        this.airport_ID = airport_ID;
        this.code = code;
        this.name = name;
//        this.location = location;
    }

    public long getAirport_ID() {
        return airport_ID;
    }

    public void setAirport_ID(long airport_ID) {
        this.airport_ID = airport_ID;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public String getLocation() {
//        return location;
//    }

//    public void setLocation(String location) {
//        this.location = location;
//    }
}

