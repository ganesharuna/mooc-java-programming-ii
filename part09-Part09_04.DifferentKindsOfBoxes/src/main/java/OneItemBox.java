
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
public class OneItemBox extends Box {
    
    private ArrayList<Item> items;
    public OneItemBox(){
        items=new ArrayList<>();
    }
    
    public void add(Item item){
        if (items.size()==0){
            items.add(item);
        }
    }
    
    public boolean isInBox(Item item){
        if (items.contains(item)){
            return true;
        }
        return false;
    }
}
