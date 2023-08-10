
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
public class Suitcase {
    
    private ArrayList<Item> items;
    private final int maximumWeight;

    public Suitcase(int maximumWeight) {
        this.maximumWeight = maximumWeight;
        this.items = new ArrayList<>();
    }
    
    public void addItem(Item item) {
        if (this.totalWeight() + item.getWeight() <= this.maximumWeight) this.items.add(item);
    }

    @Override
    public String toString() {
        if (this.items.isEmpty()) {
            return "no items (0 kg)";
        } else if (this.items.size() == 1) {
            return "1 item (" + this.items.get(0).getWeight() + " kg)"; 
        }
        
        return this.items.size() + " items (" + this.totalWeight()+ " kg)";
    }
    
    public void printItems() {
        this.items.forEach(item -> {
            System.out.println(item);
        });
    }
    
    public int totalWeight() {
        int totalWeight = 0;
        totalWeight = this.items.stream().map((item) -> item.getWeight()).reduce(totalWeight, Integer::sum);
        
        return totalWeight;
    }
    
    public Item heaviestItem() {
        if (this.items.isEmpty()) return null;
        
        Item returnItem = this.items.get(0);
        for (Item item : this.items) {
            if (item.getWeight() > returnItem.getWeight()) returnItem = item;
        }
        
        return returnItem;
    }
    
}
