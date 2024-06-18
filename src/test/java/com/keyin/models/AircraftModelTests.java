package com.keyin.models;
import com.keyin.rest.aircraft.Aircraft;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

public class AircraftModelTests {
    // need to change based on contsructor
    public void testEquals(){
        Aircraft ac1 = new Aircraft(1,"A220-300","Airbus Corp","Scott's Airline",132);
        Aircraft ac2 = new Aircraft(1,"A220-300","Airbus Corp","Scott's Airline",132);
        Assertions.assertEquals(ac1, ac2);
    }
    public void testNotEquals(){
        Aircraft ac1 = new Aircraft(1,"A220-300","Airbus Corp","Scott's Airline",132);
        Aircraft ac2 = new Aircraft(1,"A220-300","Airbus Corp","Not Scott's Airline",132);
        Assertions.assertEquals(ac1,ac2);
    }
}
