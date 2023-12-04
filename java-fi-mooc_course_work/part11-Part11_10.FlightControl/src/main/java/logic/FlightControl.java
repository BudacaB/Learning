/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import FlightControl.domain.Airplane;
import FlightControl.domain.Flight;
import FlightControl.domain.Place;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author bogdan
 */
public class FlightControl {
    
    private Map<String, Airplane> airplanes;
    private Map<String, Flight> flights;
    private Map<String, Place> places;

    public FlightControl() {
        this.airplanes = new HashMap<>();
        this.flights = new HashMap<>();
        this.places = new HashMap<>();
    }
    
    public void addAirplane(String id, int capacity) {
        this.airplanes.put(id, new Airplane(id, capacity));
    }
    
    public void addFlight(Airplane airplane, String departureId, String destinationId) {
        this.places.putIfAbsent(departureId, new Place(departureId));
        this.places.putIfAbsent(destinationId, new Place(destinationId));
        
        Flight flight = new Flight(airplane, this.places.get(departureId), this.places.get(destinationId));
        this.flights.put(flight.toString(), flight);
    }

    public Collection<Airplane> getAirplanes() {
        return airplanes.values();
    }

    public Collection<Flight> getFlights() {
        return flights.values();
    }

    public Airplane getAirplane(String id) {
        return this.airplanes.get(id);
    }
}
