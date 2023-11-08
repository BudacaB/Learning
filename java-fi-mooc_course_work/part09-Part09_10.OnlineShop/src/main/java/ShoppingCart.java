
import java.util.HashMap;
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
public class ShoppingCart {
    
    private Map<String, Item> items;

    public ShoppingCart() {
        this.items = new HashMap<>();
    }
    
    public void add(String product, int price) {
        if (this.items.containsKey(product)) {
            this.items.get(product).increaseQuantity();
        } else {
            this.items.put(product, new Item(product, 1, price));
        }
    }
    
    public int price() {
        int total = 0;
        total = this.items.values().stream().map(item -> item.price()).reduce(total, Integer::sum);
        
        return total;
    }
    
    public void print() {
        this.items.values().forEach(item -> System.out.println(item));
    }
    
}
