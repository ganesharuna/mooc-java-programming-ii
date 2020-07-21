
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ganesh
 */
public class ChangeHistory {
    private ArrayList<Double> history;
    
    public ChangeHistory(){
        this.history=new ArrayList<>();
    }
    
    public void add(double status){
        history.add(status);
    }
    
    public void clear(){
        this.history.clear();
    }
    
    public double maxValue(){
        if (history.isEmpty()){
            return 0.0;
        }
        double largest=history.get(0);
        for (int i=0; i<history.size();i++){
            if (history.get(i)>largest){
                largest=history.get(i);
            }
        }
        return largest;
    }
    
    public double minValue(){
        if (history.isEmpty()){
            return 0.0;
        }
        double smallest=history.get(0);
        for (int i=0; i<history.size();i++){
            if (history.get(i)<smallest){
                smallest=history.get(i);
            }
        }
        return smallest;
    }
    public double average(){
        if (history.isEmpty()){
            return 0.0;
        }
        int count=0;
        double sum=0.0;
        for (int i=0; i<history.size();i++){
            count++;
            sum+=history.get(i);
            }
        double average=(sum*1.0)/count;
        return average;
        }

    
    public String toString(){
            return history.toString();
    }
    
}
