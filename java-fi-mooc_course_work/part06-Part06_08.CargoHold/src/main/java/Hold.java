
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bogdan
 */
public class Hold {
    
    private final int maximumWeight;
    private ArrayList<Suitcase> suitcases;
    
    public Hold(int maximumWeight) {
        this.suitcases = new ArrayList<>();
        this.maximumWeight = maximumWeight;
    }
    
    public void addSuitcase(Suitcase suitcase) {
        if (this.totalWeight() + suitcase.totalWeight() <= this.maximumWeight) this.suitcases.add(suitcase);
    }

    @Override
    public String toString() {
        if (this.suitcases.isEmpty()) {
            return "0 suitcases (0 kg)";
        } else if (this.suitcases.size() == 1) {
            return "1 suitcase (" + this.totalWeight() + " kg)";
        }
        return this.suitcases.size() + " suitcases (" + this.totalWeight() + " kg)";
    }
    
    public void printItems() {
        this.suitcases.forEach(suitcase -> suitcase.printItems());
    }
    
    private int totalWeight() {
        int totalWeight = 0;
        totalWeight = this.suitcases.stream().map(suitcase -> suitcase.totalWeight())
                .reduce(totalWeight, Integer::sum);
        
        return totalWeight;
    }
    
}
