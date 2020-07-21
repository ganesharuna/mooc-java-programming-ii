
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
public class Box implements Packable {
    private double capacity;
    private ArrayList<Packable> list;
    
    public Box(double capacity){
        this.capacity=capacity;
        list=new ArrayList<>();
    }
    
    public void add(Packable pack){
        double max=this.weight();
        if (pack.weight()<=this.capacity-max){
            this.list.add(pack);
        }
    }
    
    public double weight(){
        double weight=0;
        double limit=this.capacity;
        for (Packable pack: list){
            if(pack.weight()<=limit){
                weight+=pack.weight();
                limit=limit-pack.weight();
            }
            
        }
        return weight;
    }
    
   public String toString(){
       return "Box: "+list.size()+" items, total weight "+ weight()+" kg";
   }
    
}
