package com.keyin.rest.airport;


import org.springframework.stereotype.Service;
import java.util.ArrayList;
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

    // AIRPORT SEARCH BY ID
    public Airport getAirport(Integer airport_ID) {
        return airportMap.get(airport_ID);
    }

    // UPDATING A SPECIFIC AIRPORT
    public Airport updateAirport(Integer airport_ID, Airport updatedAirport) {
        if(airportMap.get(airport_ID) != null){
            Airport airportToUpdate = airportMap.get(airport_ID);

            airportToUpdate.setAirport_ID(updatedAirport.getAirport_ID());
            airportToUpdate.setCode(updatedAirport.getCode());
            airportToUpdate.setName(updatedAirport.getName());
            airportToUpdate.setCity(updatedAirport.getCity());
            airportToUpdate.setProvince(updatedAirport.getProvince());

            airportMap.put(airport_ID, airportToUpdate);

            return airportToUpdate;
        }
        return null;
    }

    // DELETING A SPECIFIC Airport
    public void deleteAirport(Integer airport_ID) {
        airportMap.remove(airport_ID);
    }

    // AIRPORT SEARCH BY PROVINCE OR CITY
    public List<Airport> findAirportByProvinceOrName(String province, String name) {
        List<Airport> airportsFound = new ArrayList<Airport>();
        if(province != null){
            for (Airport airport : airportMap.values()) {
                if (airport.getProvince().equalsIgnoreCase(province)) {
                    airportsFound.add(airport);
                }
            }
        } else if (name != null){
            for (Airport airport : airportMap.values()) {
                if (airport.getName().equalsIgnoreCase(name)) {
                    airportsFound.add(airport);
                }
            }
        }

        return airportsFound;
    }

}
