
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
public class ChangeHistory {
    
    private ArrayList<Double> history;

    public ChangeHistory() {
        this.history = new ArrayList<>();
    }
    
    public void clear() {
        this.history.clear();
    }

    @Override
    public String toString() {
        return this.history.toString();
    }
    
    public double maxValue() {
        if (this.history.isEmpty()) return 0;
        
        double max = 0.0;
        
        for (double value : this.history) {
            if (value > max) max = value;
        }
        
        return max;
    }
    
    public double minValue() {
        if (this.history.isEmpty()) return 0;
        
        double min = Double.MAX_VALUE;
        
        for (double value : this.history) {
            if (value < min) min = value;
        }
        
        return min;
    }
    
    public double average() {
        if (this.history.isEmpty()) return 0;
        
        double average = 0.0;
        
        average = this.history.stream().reduce(average, Double::sum);
        
        return average / (this.history.size() * 1.0);
    }

    public void add(double status) {
        this.history.add(status);
    }
    
    
}
