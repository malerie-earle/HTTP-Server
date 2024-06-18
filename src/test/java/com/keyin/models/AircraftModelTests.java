package com.keyin.models;
import com.keyin.rest.aircraft.Aircraft;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

public class AircraftModelTests {
    // need to change based on contsructor
    public void testEquals(){
        Aircraft ac1 = new Aircraft(1,"Airbus A220-300","Air Canada",132);
        Aircraft ac2 = new Aircraft(1,"Airbus A220-300","Air Canada",132);
        Assertions.assertEquals(ac1, ac2);
    }
    public void testNotEquals(){
        Aircraft ac1 = new Aircraft(1,"Airbus A220-300","Air Canada",132);
        Aircraft ac2 = new Aircraft(2,"Airtrain T9000","Off the Rails",200);
        Assertions.assertEquals(ac1,ac2);
    }
}
