package com.keyin.rest.passenger;


import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class PassengerService {
    private static Map<Integer, Passenger> passengerMap = new HashMap<Integer, Passenger>();

    // ADDING A NEW PASSENGER
    public Passenger createPassenger(Passenger newPassenger) {
        passengerMap.put(passengerMap.size() + 1, newPassenger);
        return newPassenger;
    }

    // LOADING ALL PASSENGERS
    public List<Passenger> getAllPassengers() {
        return List.copyOf(passengerMap.values());
    }

    // PASSENGER SEARCH BY ID
    public Passenger getPassenger(Integer passenger_ID) {
        return passengerMap.get(passenger_ID);
    }

    // UPDATING A SPECIFIC PASSENGER
    public Passenger updatePassenger(Integer passenger_ID, Passenger updatedPassenger) {
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
    public void deletePassenger(Integer passenger_ID) {
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