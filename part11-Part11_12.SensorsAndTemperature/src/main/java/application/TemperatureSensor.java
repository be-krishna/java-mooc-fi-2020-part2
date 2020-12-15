/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.Random;

/**
 *
 * @author be-krishna
 */
public class TemperatureSensor implements Sensor {

    private boolean isOnNow;

    public TemperatureSensor() {
        this.isOnNow = false;
    }

    @Override
    public boolean isOn() {
        return this.isOnNow;
    }

    @Override
    public void setOn() {
        this.isOnNow = true;
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setOff() {
        this.isOnNow = false;
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int read() {
        this.isOnNow = true;

        return new Random().nextInt(61) - 30;
    }

}
