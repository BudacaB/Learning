/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bogdan
 */
public class Container {
    
    private int liquidAmount;

    public Container() {
        this.liquidAmount = 0;
    }
    
    public int contains() {
        return this.liquidAmount;
    }
    
    public void add(int amount) {
        if (amount > 0) {
            if (amount + this.liquidAmount > 100) {
                this.liquidAmount = 100;
            } else {
                this.liquidAmount += amount;
            }
        }
    }
    
    public void remove(int amount) {
        if (amount > 0) {
            if (this.liquidAmount - amount < 0) {
                this.liquidAmount = 0;
            } else {
                this.liquidAmount -= amount;
            }
        }
    }

    @Override
    public String toString() {
        return this.liquidAmount + "/100";
    }
    
}
