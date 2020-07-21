/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

/**
 *
 * @author Ganesh
 */
public class StandardSensor implements Sensor {
    
    private int number;
    
    public StandardSensor(int number){
        this.number=number;
    }
    
    public void setOff(){
        
    }
    
    public void setOn(){
        
    }
    
    public boolean isOn(){
        return true;
    }
    
    public int read(){
        return this.number; 
    }
}
