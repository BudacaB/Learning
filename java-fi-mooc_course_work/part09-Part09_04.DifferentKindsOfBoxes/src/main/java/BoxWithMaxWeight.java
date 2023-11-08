
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
public class BoxWithMaxWeight extends Box {
    
    private final int maxWeight;
    private int currentWeight;
    private List<Item> items;

    public BoxWithMaxWeight(int capacity) {
        this.maxWeight = capacity;
        this.currentWeight = 0;
        this.items = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        if (currentWeight + item.getWeight() <= maxWeight) {
            this.items.add(item);
            currentWeight += item.getWeight();
        }
    }

    @Override
    public boolean isInBox(Item item) {
        return this.items.contains(item);
    }

    
    
}
