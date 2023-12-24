/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bogdan
 */
public class Hideout<T> {
    
    private T thing;

    public Hideout() {
    }
    
    public void putIntoHideout(T toHide) {
        this.thing = toHide;
    }
    
    public T takeFromHideout() {
        if (this.thing == null) return null;
        T toReturn = this.thing;
        this.thing = null;
        return toReturn;
    }
    
    public boolean isInHideout() {
        return this.thing != null;
    }
}
