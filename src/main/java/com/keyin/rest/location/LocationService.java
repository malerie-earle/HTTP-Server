package com.keyin.rest.location;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class LocationService {
    private static Map<Integer, Location> locationMap = new HashMap<Integer, Location>();

    // ADDING A NEW Location
    public Location createLocation(Location newLocation) {
        locationMap.put(locationMap.size() + 1, newLocation);

        return newLocation;
    }

    // LOADING ALL CITIES
    public List<Location> getAllLocations() {
        return List.copyOf(locationMap.values());
    }

    // Location SEARCH BY INDEX
    public Location getLocation(Integer index) {
        return locationMap.get(index);
    }

    // Location SEARCH BY PROVINCE
    public List<Location> findLocationByProvince(String province) {
        List<Location> citiesFound = new ArrayList<Location>();
        for (Location Location : locationMap.values()) {
            if (Location.getProvince().equalsIgnoreCase(province)) {
                citiesFound.add(Location);
            }
        }
        return citiesFound;

    }

    // DELETING A SPECIFIC Location
    public void deleteLocation(Integer index) {
        locationMap.remove(index);
    }

    // UPDATING A SPECIFIC Location
    public Location updateLocation(Integer index, Location updatedLocation) {
        Location locationToUpdate = locationMap.get(index);

        locationToUpdate.setLocation_ID(updatedLocation.getLocation_ID());
        locationToUpdate.setCity(updatedLocation.getCity());
        locationToUpdate.setProvince(updatedLocation.getProvince());
        locationToUpdate.setAirport(updatedLocation.getAirport());

        locationMap.put(index, locationToUpdate);

        return locationToUpdate;
    }


}
