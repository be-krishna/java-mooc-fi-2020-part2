/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author be-krishna
 */
public class AverageSensor implements Sensor{
    
    private List<Sensor> sensors ;
    private List<Integer> readings;

    public AverageSensor() {
        this.sensors = new ArrayList<>();
        this.readings = new ArrayList<>();
    }
    
    
    
    public void addSensor(Sensor toAdd){
        this.sensors.add(toAdd);
    }
    
    public List<Integer> readings(){
        return readings;
    }

    @Override
    public boolean isOn() {
        for(Sensor sensor: this.sensors){
            if(!sensor.isOn()){
                return false;
            }
        }
        
        return true;
    }

    @Override
    public void setOn() {
        for(Sensor sensor: this.sensors){
            sensor.setOn();
        }
    }

    @Override
    public void setOff() {
         for(Sensor sensor: this.sensors){
            sensor.setOff();
        }
    }

    @Override
    public int read() {
        
        if(!isOn() || this.sensors.isEmpty()){
            throw new IllegalStateException("Either the sensors are off or no sensors are added");
        }
        
        double avg = sensors.stream().mapToInt(sensor -> sensor.read()).average().getAsDouble();
        
        int value = (int) Math.round(avg);
        
        readings.add(value);
        
        return value;
    }
    
}
