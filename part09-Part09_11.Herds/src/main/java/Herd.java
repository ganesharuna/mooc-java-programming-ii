
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ganesh
 */
public class Herd implements Movable {
    private List<Movable> herd;
    
    public Herd(){
        this.herd=new ArrayList<>();
    }
    
    public void addToHerd(Movable movable){
        herd.add(movable);
    }
    
    public void move(int dx, int dy){
        for (Movable movable: herd){
            movable.move(dx, dy);
        }
    }
    
    public String toString(){
        String list="";
        for (Movable movable: herd){
            list+=(movable.toString()+"\n");
        }
        return list;
    }
    
}
