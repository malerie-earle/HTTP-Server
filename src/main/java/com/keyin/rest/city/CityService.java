package com.keyin.rest.city;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CityService {
    private static Map<Integer, City> cityMap = new HashMap<Integer, City>();

    // ADDING A NEW CITY
    public City createCity(City newCity) {
        cityMap.put(cityMap.size() + 1, newCity);

        return newCity;
    }

    // LOADING ALL CITIES
    public List<City> getAllCities() {
        return List.copyOf(cityMap.values());
    }

    // GETTING A SPECIFIC CITY BY INDEX
    public City getCity(Integer index) {
        return cityMap.get(index);
    }

    // DELETING A SPECIFIC CITY
    public void deleteCity(Integer index) {
        cityMap.remove(index);
    }

    // UPDATING A SPECIFIC CITY
    public City updateCity(Integer index, City updatedCity) {
        City cityToUpdate = cityMap.get(index);

        cityToUpdate.setCity_ID(updatedCity.getCity_ID());
        cityToUpdate.setName(updatedCity.getName());
        cityToUpdate.setProvince(updatedCity.getProvince());
        cityToUpdate.setAirports(updatedCity.getAirports());

        cityMap.put(index, cityToUpdate);

        return cityToUpdate;
    }

}
