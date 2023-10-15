
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bogdan
 */
public class VehicleRegistry {
    
    private HashMap<LicensePlate, String> registry;

    public VehicleRegistry() {
        this.registry = new HashMap<>();
    }
    
    public boolean add(LicensePlate licensePlate, String owner) {
        if (this.registry.containsKey(licensePlate)) return false;
        
        this.registry.put(licensePlate, owner);
        return true;
    }
    
    public String get(LicensePlate licensePlate) {
        if (this.registry.containsKey(licensePlate)) return this.registry.get(licensePlate);
        return null;
    }
    
    public boolean remove(LicensePlate licensePlate) {
        if (this.registry.containsKey(licensePlate)) {
            this.registry.remove(licensePlate);
            return true;
        } else {
            return false;
        }
    }
    
    public void printLicensePlates() {
        this.registry.keySet().forEach(key -> System.out.println(key));
    }
    
    public void printOwners() {
        List<String> owners = new ArrayList<>();
        
        this.registry.values().forEach(owner -> {
            if (!owners.contains(owner)) {
                owners.add(owner);
                System.out.println(owner);
            }
        });
    }
    
}
