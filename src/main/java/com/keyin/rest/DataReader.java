package com.keyin.rest;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;

import com.keyin.rest.aircraft.Aircraft;
import com.keyin.rest.airport.Airport;

public class DataReader {

    private static final ObjectMapper objectMapper = new ObjectMapper();

    public static List<Aircraft> loadAircraftsFromJson(String jsonFilePath) throws IOException {
        return objectMapper.readValue(new File(jsonFilePath), new TypeReference<List<Aircraft>>() {});
    }

    public static List<Airport> loadAirportsFromJson(String jsonFilePath) throws IOException {
        return objectMapper.readValue(new File(jsonFilePath), new TypeReference<List<Airport>>() {});
    }
}
