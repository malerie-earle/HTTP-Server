package com.keyin.controllers;

import com.keyin.rest.airport.Airport;
import com.keyin.rest.airport.AirportController;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import java.util.HashMap;
import java.util.Map;
/*
public class AirportControllerTests {
    private AirportController airportController = new AirportController();

    // Testing the ability to create airport. Note that other tests will fail if this one fails.
    @Test
    public void testCreateAirport(){
        // We create an airport
        airportController.createAirport();
        // We see if the size changed
        Assertions.assertEquals(airportController.airportService.airportMap.size(), 1);
    }

    // Testing the ability to get all airport
    @Test
    public void testGetAllAirport(){
        // We setup the Controller with some airport
        airportController.createAirport();
        airportController.createAirport();
        airportController.createAirport();

        Airport ap1 = new Airport();
        Airport ap2 = new Airport();
        Airport ap3 = new Airport();
        // will need to change depending on data structure
        Map<Integer, Airport> eairportMap = new HashMap<>();
        eairportMap.put(0,ap1);
        eairportMap.put(1,ap2);
        eairportMap.put(2,ap3);
        // The below might require an override of the equals method for airport
        // We compare to see if the expected map is equal to the actual map
        Assertions.assertEquals(eairportMap, airportController.airportService.airportMap);
    }

    // Testing the ability to get airport by id
    @Test
    public void testGetAirportByID(){
        // We setup the Controller with some airport
        airportController.createAirport();
        airportController.createAirport();
        airportController.createAirport();

        // The expected airport
        Airport eap = new Airport();
        // The below might require an override of the equals method for airport
        // We compare the get from the controller to the desired airport
        Assertions.assertEquals(airportController.getAirportByID(1), eap);
    }

    // Testing the ability to update airport by id
    @Test
    public void testUpdateAirport(){
        // We setup the Controller with some airport
        airportController.createAirport();
        airportController.createAirport();
        airportController.createAirport();
        // We invoke the update method
        airportController.updateAirportByID();
        // The expected airport
        Airport eap = new Airport();
        // The below might require an override of the equals method for airport
        // We check if the expected airport is equal to the actual airport
        Assertions.assertEquals(airportController.airportController.airportService.airportMap.get(1), eap);
    }

    // Testing the ability to delete airport by id
    @Test
    public void testDeleteAirport(){
        // We setup the Controller with some airport
        airportController.createAirport();
        airportController.createAirport();
        airportController.createAirport();
        // We invoke the delete method
        airportController.deleteAirportByID(1);
        // We check if the airport is not in the map
        Assertions.assertFalse(airportController.airportController.airportService.airportMap.containsKey(1));
    }


}

 */
