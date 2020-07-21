/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.Random;

/**
 *
 * @author Ganesh
 */
public class TemperatureSensor implements Sensor {
    
    private boolean on;
    public TemperatureSensor(){
        this.on=false;
    }
    
    public void setOff(){
        this.on=false;
    }
    
    public void setOn(){
        this.on=true;
    }
    
    public boolean isOn(){
        return this.on;
    }
    
    public int read(){
        if (this.on==false){
            throw new IllegalArgumentException("Sensor must be on");
        }
        int number=new Random().nextInt(61);
        return number-30;
    }
}
