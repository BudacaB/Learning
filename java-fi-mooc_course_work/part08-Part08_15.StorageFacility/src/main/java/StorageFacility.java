
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bogdan
 */
public class StorageFacility {
    
    private HashMap<String, ArrayList<String>> storage;

    public StorageFacility() {
        this.storage = new HashMap<>();
    }
    
    public void add(String unit, String item) {
        this.storage.putIfAbsent(unit, new ArrayList<>());
        this.storage.get(unit).add(item);
    }
    
    public ArrayList<String> contents(String storageUnit) {
        if (this.storage.containsKey(storageUnit) && !this.storage.get(storageUnit).isEmpty()) 
            return this.storage.get(storageUnit);
        return new ArrayList<>();
    }
    
    public void remove(String storageUnit, String item) {
        if (this.storage.containsKey(storageUnit)) {
            if (this.storage.get(storageUnit).isEmpty()) {
                this.storage.remove(storageUnit);
            } else {
                this.storage.get(storageUnit).remove(item);
                if (this.storage.get(storageUnit).isEmpty()) this.storage.remove(storageUnit);; 
            }
        }
        
    }
    
    public ArrayList<String> storageUnits() {
        ArrayList<String> storageUnits = new ArrayList<>();
        this.storage.keySet().forEach(storageUnit -> {
            if (!this.storage.get(storageUnit).isEmpty()) {
                storageUnits.add(storageUnit);
            } 
        });
        
        return storageUnits;
    }
    
}
