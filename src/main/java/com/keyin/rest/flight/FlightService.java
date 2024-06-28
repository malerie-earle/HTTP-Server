package com.keyin.rest.flight;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class FlightService {
    private Map<Long, Flight> flightMap = new HashMap<Long, Flight>();
    private long id = 1;

    public Flight createNewFlight(Flight newFlight){
        newFlight.setFlight_ID(id);
        flightMap.put(id,newFlight);
        id++;
        return newFlight;
    }

    public Flight getFlightByID(Long id){
        return flightMap.get(id);
    }

    public Flight updateFlightByID(Long id, Flight updatedFlight){
        if(flightMap.get(id) != null){
            updatedFlight.setFlight_ID(id);
            flightMap.put(id,updatedFlight);
            return updatedFlight;
        }
        return null;
    }

    public Flight deleteFlight(Long id){
        return flightMap.remove(id);
    }

    public List<Flight> getAllFlight(){
        return List.copyOf(flightMap.values());
    }
}
