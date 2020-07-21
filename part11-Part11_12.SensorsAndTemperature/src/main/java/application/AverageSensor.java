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
 * @author Ganesh
 */
public class AverageSensor implements Sensor {
    
    private ArrayList<Sensor> sensors;
    private ArrayList<Integer> readings;
    
    public AverageSensor(){
        this.sensors=new ArrayList<>();
        this.readings=new ArrayList<>();
    }
    
    public void addSensor(Sensor toAdd){
        this.sensors.add(toAdd);
    }
    
    public void setOn(){
        for (Sensor sensor: sensors){
            sensor.setOn();
        }
    }
    
    public void setOff(){
        for (Sensor sensor: sensors){
            sensor.setOff();
        }
    }
    
    public boolean isOn(){
        for (Sensor sensor: sensors){
            if (sensor.isOn()==true){
                return true;
            }
        }
        return false;
    }
    
    
    @Override
    public int read(){
        if (this.isOn()==false||this.sensors==null||this.sensors.size()<1){
             throw new IllegalArgumentException("Grade must be between 0 and 5.");
        }
        int count=0;
        int sum=0;
        for (Sensor sensor: sensors){
            count++;
            sum+=sensor.read();
        }
        int average= sum/count;
        this.readings.add(average);
        return average;
    }
    
    public List<Integer> readings(){
        return this.readings;
    }
}
