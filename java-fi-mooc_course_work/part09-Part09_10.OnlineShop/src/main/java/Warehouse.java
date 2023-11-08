
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bogdan
 */
public class Warehouse {
    
    private Map<String, Integer> products;
    private Map<String, Integer> stocks;

    public Warehouse() {
        this.products = new HashMap();
        this.stocks = new HashMap<>();
    }
    
    public void addProduct(String product, int price, int stock) {
        products.put(product, price);
        stocks.put(product, stock);
    }
    
    public int price(String product) {
        if (this.products.containsKey(product)) return this.products.get(product);
        return -99;
    }
    
    public int stock(String product) {
        if (this.stocks.containsKey(product)) return this.stocks.get(product);
        return 0;
    }
    
public boolean take(String product) {
        if (this.stocks.containsKey(product)) {
            int stock = this.stock(product);
            if (stock > 0) {
                this.stocks.put(product, stock - 1);
                return true;
            }
        }
        
        return false;
    }
    
    public Set<String> products() {
        Set<String> productNames = new HashSet<>();
        this.products.keySet().forEach((key) -> {
            productNames.add(key);
        });
        
        return productNames;
    }
    
    
}
