package com.keyin.rest.passenger;


import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class PassengerService {
    private static Map<Long, Passenger> passengerMap = new HashMap<Long, Passenger>();
    private long id = 1;
    // ADDING A NEW PASSENGER
    public Passenger createPassenger(Passenger newPassenger) {
        newPassenger.setPassenger_ID(id);
        passengerMap.put(id, newPassenger);
        id++;
        return newPassenger;
    }

    // LOADING ALL PASSENGERS
    public List<Passenger> getAllPassengers() {
        return List.copyOf(passengerMap.values());
    }

    // PASSENGER SEARCH BY ID
    public Passenger getPassenger(Long passenger_ID) {
        return passengerMap.get(passenger_ID);
    }

    // UPDATING A SPECIFIC PASSENGER
    public Passenger updatePassenger(Long passenger_ID, Passenger updatedPassenger) {
        if(passengerMap.get(passenger_ID) != null){
            Passenger passengerToUpdate = passengerMap.get(passenger_ID);

            passengerToUpdate.setPassenger_ID(updatedPassenger.getPassenger_ID());
            passengerToUpdate.setFirst_name(updatedPassenger.getFirst_name());
            passengerToUpdate.setLast_name(updatedPassenger.getLast_name());
            passengerToUpdate.setEmail(updatedPassenger.getEmail());

            passengerMap.put(passenger_ID, passengerToUpdate);

            return passengerToUpdate;
        }
        return null;
    }

    // DELETING A SPECIFIC PASSENGER
    public void deletePassenger(Long passenger_ID) {
        passengerMap.remove(passenger_ID);
    }

    // PASSENGER SEARCH BY NAME
    public List<Passenger> findPassengerByName(String firstName, String lastName) {
        List<Passenger> passengersFound = new ArrayList<Passenger>();
        if(firstName != null || lastName != null){
            for (Passenger Passenger : passengerMap.values()) {
                if (Passenger.getFirst_name().equalsIgnoreCase(firstName) && Passenger.getLast_name().equalsIgnoreCase(lastName)) {
                    passengersFound.add(Passenger);
                }
            }
        }

        return passengersFound;
    }

}