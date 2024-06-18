package com.keyin.models;

import com.keyin.rest.airport.Airport;
import com.keyin.rest.city.City;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;

public class CityModelTests {
    // need to change based on contsructor
    public void testEquals(){
        City c1 = new City(1,"St.John's","NL", new ArrayList<>());
        City c2 = new City(1,"St.John's","NL", new ArrayList<>());
        Assertions.assertEquals(c1, c2);
    }
    // need to change based on contsructor
    public void testNotEquals(){
        City c1 = new City(1,"St.John's","NL", new ArrayList<>());
        City c2 = new City(2,"Deer Lake","NL", new ArrayList<>());
        Assertions.assertEquals(c1,c2);
    }
    //
    public void insertAndRemoveAirports(){
        City c1 = new City(1,"St.John's","NL", new ArrayList<>());
        Airport a1 = new Airport(1,c1,"St.John's International Airport","YYT");
        c1.insertAirport(a1);
        Assertions.assertEquals(c1.getAirports().size(),1);
        c1.removeAirport(1);
        Assertions.assertEquals(c1.getAirports().size(), 0);
    }
}
