package com.keyin.controllers;

import com.keyin.rest.city.City;
import com.keyin.rest.city.CityController;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import java.util.HashMap;
import java.util.Map;

public class CityControllerTests {
    private CityController cityController = new CityController();

    // Testing the ability to create city. Note that other tests will fail if this one fails.
    @Test
    public void testCreateCity(){
        // We create an city
        cityController.createCity();
        // We see if the size changed
        Assertions.assertEquals(cityController.cityService.cityMap.size(), 1);
    }

    // Testing the ability to get all city
    @Test
    public void testGetAllCity(){
        // We setup the Controller with some city
        cityController.createCity();
        cityController.createCity();
        cityController.createCity();

        City c1 = new City();
        City c2 = new City();
        City c3 = new City();
        // will need to change depending on data structure
        Map<Integer, City> ecityMap = new HashMap<>();
        ecityMap.put(0,c1);
        ecityMap.put(1,c2);
        ecityMap.put(2,c3);
        // The below might require an override of the equals method for city
        // We compare to see if the expected map is equal to the actual map
        Assertions.assertEquals(ecityMap, cityController.cityService.cityMap);
    }

    // Testing the ability to get city by id
    @Test
    public void testGetCityByID(){
        // We setup the Controller with some city
        cityController.createCity();
        cityController.createCity();
        cityController.createCity();

        // The expected city
        City ec = new City();
        // The below might require an override of the equals method for city
        // We compare the get from the controller to the desired city
        Assertions.assertEquals(cityController.getCityByID(1), ec);
    }

    // Testing the ability to update city by id
    @Test
    public void testUpdateCity(){
        // We setup the Controller with some city
        cityController.createCity();
        cityController.createCity();
        cityController.createCity();
        // We invoke the update method
        cityController.updateCityByID();
        // The expected city
        City ec = new City();
        // The below might require an override of the equals method for city
        // We check if the expected city is equal to the actual city
        Assertions.assertEquals(cityController.cityController.cityService.cityMap.get(1), ec);
    }

    // Testing the ability to delete city by id
    @Test
    public void testDeleteCity(){
        // We setup the Controller with some city
        cityController.createCity();
        cityController.createCity();
        cityController.createCity();
        // We invoke the delete method
        cityController.deleteCityByID(1);
        // We check if the city is not in the map
        Assertions.assertFalse(cityController.cityController.cityService.cityMap.containsKey(1));
    }
}
