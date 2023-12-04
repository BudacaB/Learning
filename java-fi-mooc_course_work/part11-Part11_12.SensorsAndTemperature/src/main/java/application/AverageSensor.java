/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author bogdan
 */
public class AverageSensor implements Sensor {
    
    private List<Sensor> sensors;
    private List<Integer> averages;

    public AverageSensor() {
        this.sensors = new ArrayList<>();
        this.averages = new ArrayList<>();
    }

    @Override
    public boolean isOn() {
        return this.sensors.stream().noneMatch((sensor) -> (!sensor.isOn()));
    }

    @Override
    public void setOn() {
        this.sensors.forEach(sensor -> sensor.setOn());
    }

    @Override
    public void setOff() {
        this.sensors.forEach(sensor -> sensor.setOff());
    }

    @Override
    public int read() {
        if (this.isOn() == false || this.sensors.isEmpty()) throw new IllegalStateException();

        int average = (int) Math.floor(this.sensors.stream().mapToInt(sensor -> sensor.read()).average().getAsDouble());
        this.averages.add(average);
        
        return average;
    }
    
    public void addSensor(Sensor toAdd) {
        this.sensors.add(toAdd);
    }
    
    public List<Integer> readings() {
        return averages;
    }
    
}
