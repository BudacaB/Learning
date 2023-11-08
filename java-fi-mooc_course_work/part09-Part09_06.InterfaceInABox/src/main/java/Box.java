
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bogdan
 */
public class Box implements Packable {
    private double maximumWeight;
    private List<Packable> items;

    public Box(double maximumWeight) {
        this.maximumWeight = maximumWeight;
        this.items = new ArrayList<>();
    }
    
    @Override
    public double weight() {
        double weight = 0.0; 
        if (this.items.isEmpty()) return weight;
        weight = this.items.stream().map(item -> item.weight()).reduce(weight, Double::sum);
        return weight;
    }
    
    public void add (Packable item) {
        if (this.weight() + item.weight() <= this.maximumWeight) {
            this.items.add(item);
        }
    }

    @Override
    public String toString() {
        return "Box: " + this.items.size() + " items, total weight " + this.weight() + " kg";
    }
}
