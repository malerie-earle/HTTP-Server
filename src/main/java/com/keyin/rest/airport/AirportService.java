package com.keyin.rest.airport;


import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class AirportService {
    private static Map<Integer, Airport> airportMap = new HashMap<Integer, Airport>();

    // ADDING A NEW AIRPORT
    public Airport createAirport(Airport newAirport) {
        airportMap.put(airportMap.size() + 1, newAirport);
        return newAirport;
    }

    // LOADING ALL AIRPORTS
    public List<Airport> getAllAirports() {
        return List.copyOf(airportMap.values());
    }

    // AIRPORT SEARCH BY INDEX
    public Airport getAirport(Integer index) {
        return airportMap.get(index);
    }

    // UPDATING A SPECIFIC AIRPORT
    public Airport updateAirport(Integer index, Airport updatedAirport) {
        if(airportMap.get(index) != null){
            Airport airportToUpdate = airportMap.get(index);

            airportToUpdate.setAirport_ID(updatedAirport.getAirport_ID());
            airportToUpdate.setCode(updatedAirport.getCode());

            airportMap.put(index, airportToUpdate);

            return airportToUpdate;
        }
        return null;
    }

    // DELETING A SPECIFIC Airport
    public void deleteAirport(Integer index) {
        airportMap.remove(index);
    }

}
