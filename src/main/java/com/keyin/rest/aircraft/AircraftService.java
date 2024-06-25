package com.keyin.rest.aircraft;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

@Service
public class AircraftService {
    private Map<Integer, Aircraft> aircraftMap = new HashMap<Integer, Aircraft>();

    public Aircraft createNewAircraft(Aircraft newAircraft){
        newAircraft.setAircraft_ID(aircraftMap.size());
        aircraftMap.put(aircraftMap.size(), newAircraft);
        return newAircraft;
    }

    public Aircraft getAircraftByID(Integer id){
        return aircraftMap.get(id);
    }

    public Aircraft updateAircraftByID(Integer id, Aircraft updatedAircraft){
        if(aircraftMap.get(id) != null){
            updatedAircraft.setAircraft_ID(id);
            aircraftMap.put(id,updatedAircraft);
            return updatedAircraft;
        }
        return null;
    }

    public Aircraft deleteAircraft(Integer id){
        return aircraftMap.remove(id);
    }

    public List<Aircraft> getAllAircraft(){
        return List.copyOf(aircraftMap.values());
    }

    public List<Aircraft> findAircraftByAirline(String airline) {
        List<Aircraft> aircraftsFound = new ArrayList<Aircraft>();
        for (Aircraft aircraft : aircraftMap.values()) {
            if (aircraft.getAirline().equalsIgnoreCase(airline)) {
                aircraftsFound.add(aircraft);
            }
        }
        return aircraftsFound;
    }

}
