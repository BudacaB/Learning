/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlightControl.domain;

/**
 *
 * @author bogdan
 */
public class Place {
    
    private String id;

    public Place(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return this.id;
    }
    
}
