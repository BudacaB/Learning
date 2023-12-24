
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bogdan
 */
public class List<T> {
    
    private T[] values;
    private int firstFreeIndex;

    public List() {
        this.values = (T[]) new Object[10];
        this.firstFreeIndex = 0;
    }
    
    public void add(T value) {
        if (firstFreeIndex == this.values.length) this.values = Arrays
                .copyOf(this.values, this.values.length + this.values.length / 2);
        
        this.values[firstFreeIndex] = value;
        this.firstFreeIndex++;
    }
    
    public boolean contains(T value) {
        return valueIndex(value) > -1;
    }
    
    public void remove(T value) {
        int indexOfValue = valueIndex(value);
        if (indexOfValue < 0) return;
        
        moveToLeft(indexOfValue);
        this.firstFreeIndex--;
        
    }
    
    public T value(int index) {
        if (index < 0 || index > firstFreeIndex) {
            throw new IndexOutOfBoundsException("Index " + index + " outside of [0, " + this.firstFreeIndex + "]");
        }
        
        return this.values[index];
    }
    
    public int size() {
        return this.firstFreeIndex;
    }
    
    public int valueIndex(T value) {
        for (int i = 0; i < firstFreeIndex; i++) {
            if (this.values[i].equals(value)) return i;
        }
        
        return -1;
    }

    private void moveToLeft(int indexOfValue) {
        for (int i = indexOfValue; i < firstFreeIndex; i++) this.values[i] = this.values[i + 1];
    }
    
    
}
