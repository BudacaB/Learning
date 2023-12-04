/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.Random;

/**
 *
 * @author bogdan
 */
public class TemperatureSensor implements Sensor {
    
    private boolean isOn;

    public TemperatureSensor() {
        this.isOn = false;
    }

    @Override
    public boolean isOn() {
        return this.isOn;
    }

    @Override
    public void setOn() {
        if (this.isOn == false) this.isOn = true;
    }

    @Override
    public void setOff() {
        if (this.isOn == true) this.isOn = false;
    }

    @Override
    public int read() {
        if (this.isOn == false) throw new IllegalStateException();
        
        return new Random().nextInt(61) - 30;
    }
    
}
