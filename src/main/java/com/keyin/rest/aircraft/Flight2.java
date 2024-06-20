package com.keyin.rest.flight;

import com.keyin.rest.aircraft.Aircraft;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Flight {
    private String flightNumber;
    private Aircraft aircraft;
    private boolean[][] seatOccupied;

    public Flight(String flightNumber, Aircraft aircraft) {
        this.flightNumber = flightNumber;
        this.aircraft = aircraft;
        this.seatOccupied = new boolean[aircraft.getRows()][aircraft.getColumns()];
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public Aircraft getAircraft() {
        return aircraft;
    }

    public void setAircraft(Aircraft aircraft) {
        this.aircraft = aircraft;
    }

    public void occupySeat(int row, int col) {
        if (row < aircraft.getRows() && col < aircraft.getColumns()) {
            seatOccupied[row][col] = true;
        }
    }

    public void assignRandomSeat() {
        Random random = new Random();
        while (true) {
            int row = random.nextInt(aircraft.getRows());
            int col = random.nextInt(aircraft.getColumns());
            if (!seatOccupied[row][col]) {
                seatOccupied[row][col] = true;
                break;
            }
        }
    }

    public List<String> seatingChart() {
        List<String> chart = new ArrayList<>();

        // Total seats per section between aisles
        int sections = aircraft.getNumAisles() + 1;
        int seatsPerSection = aircraft.getColumns() / sections;
        int extraSeats = aircraft.getColumns() % sections;

        // Header row indicating seat labels
        StringBuilder header = new StringBuilder(" ");
        char seatLabel = 'A';
        for (int j = 0; j < sections; j++) {
            for (int k = 0; k < seatsPerSection; k++) {
                header.append(seatLabel++);
            }
            if (extraSeats > 0) {
                header.append(seatLabel++);
                extraSeats--;
            }
            if (j < aircraft.getNumAisles()) {
                header.append(" "); // Adding aisle
            }
        }
        chart.add(header.toString());

        // Reset extraSeats for row construction
        extraSeats = aircraft.getColumns() % sections;

        for (int i = 0; i < aircraft.getRows(); i++) {
            StringBuilder row = new StringBuilder((i + 1) + ": ");
            seatLabel = 'A';
            for (int j = 0; j < sections; j++) {
                for (int k = 0; k < seatsPerSection; k++) {
                    row.append(seatOccupied[i][seatLabel - 'A'] ? 'X' : 'o');
                    seatLabel++;
                }
                if (extraSeats > 0) {
                    row.append(seatOccupied[i][seatLabel - 'A'] ? 'X' : 'o');
                    seatLabel++;
                    extraSeats--;
                }
                if (j < aircraft.getNumAisles()) {
                    row.append(" "); // Adding aisle
                }
            }
            chart.add(row.toString());
        }

        return chart;
    }

    public static void main(String[] args) {
        Aircraft aircraft = new Aircraft(1, "Boeing 737", "Airline X", 150, 30, 6, 1);
        Flight flight = new Flight("FL123", aircraft);

        // Simulate selling seats randomly
        for (int i = 0; i < 10; i++) {
            flight.assignRandomSeat();
        }

        List<String> chart = flight.seatingChart();
        for (String row : chart) {
            System.out.println(row);
        }
    }
}
