package com.keyin.rest.flight;

import com.keyin.rest.aircraft.Aircraft;
import com.keyin.rest.airport.Airport;
import com.keyin.rest.location.Location;
import com.keyin.rest.DataReader;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FlightGenerator {

    // Sample JSON file paths
    private static final String CITIES_JSON_FILE = "cities.json";
    private static final String AIRCRAFTS_JSON_FILE = "aircrafts.json";
    private static final String AIRPORTS_JSON_FILE = "airports.json";

    private List<Airport> airports;
    private List<Aircraft> aircrafts;
    private List<Location> cities;

    public FlightGenerator() {
        try {
            this.airports = DataReader.loadAirportsFromJson(AIRPORTS_JSON_FILE);
            this.aircrafts = DataReader.loadAircraftsFromJson(AIRCRAFTS_JSON_FILE);
            this.cities = DataReader.loadCitiesFromJson(CITIES_JSON_FILE);
        } catch (IOException e) {
            e.printStackTrace();
            // Handle exception as needed (e.g., log, throw, or exit)
        }
    }

    // Constructor to initialize JSON lists (replace with actual data loading)
    public FlightGenerator(List<Airport> airports, List<Aircraft> aircrafts, List<Location> cities) {
        this.airports = airports;
        this.aircrafts = aircrafts;
        this.cities = cities;
    }

    // Method to generate 100 random flights
    public List<Flight> generateFlights() {
        List<Flight> flights = new ArrayList<>();

        Random random = new Random();
        LocalDateTime now = LocalDateTime.now();

        for (int i = 0; i < 100; i++) {
            // Randomly select departure and arrival airports
            Airport departureAirport = airports.get(random.nextInt(airports.size()));
            Airport arrivalAirport;
            do {
                arrivalAirport = airports.get(random.nextInt(airports.size()));
            } while (arrivalAirport.equals(departureAirport)); // Ensure departure and arrival are different

            // Randomly select an aircraft
            Aircraft aircraft = aircrafts.get(random.nextInt(aircrafts.size()));

            // Generate random departure and arrival times within the next year
            LocalDateTime departureTime = now.plusDays(random.nextInt(365));
            LocalDateTime arrivalTime = departureTime.plusHours(random.nextInt(24)).plusMinutes(random.nextInt(60));

            // Create a new Flight instance
            Flight flight = new Flight();
            flight.setFlight_ID(i + 1); // Assuming flight_ID starts from 1
            flight.setFlight_number("FL" + (i + 1)); // Example of setting flight_number
            flight.setDeparture(departureAirport);
            flight.setArrival(arrivalAirport);
            flight.setAircraft(aircraft);
            flight.setDeparture_time(departureTime);
            flight.setArrival_time(arrivalTime);
            flight.setStatus(random.nextBoolean() ? Flight.Status.ON_TIME : Flight.Status.DELAYED); // Example of setting status

            flights.add(flight);
        }

        return flights;
    }

    // Example main method to demonstrate usage
    public static void main(String[] args) {
        FlightGenerator generator = new FlightGenerator();

        // Generate 100 flights
        List<Flight> flights = generator.generateFlights();

        // Print or process generated flights as needed
        for (Flight flight : flights) {
            System.out.println(flight.toString()); // Example of printing flight details
        }
    }
}
