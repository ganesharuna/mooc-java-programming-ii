
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
public class BoxWithMaxWeight extends Box {
        private int capacity;
        private ArrayList<Item> items;
        
        public BoxWithMaxWeight(int capacity){
            this.capacity=capacity;
            items=new ArrayList<>();
        }
        
        public void add(Item item){
            int weight=item.getWeight();
            if (this.capacity-weight>=0){
                items.add(item);
                this.capacity=this.capacity-weight;
            }
        }
        
        public boolean isInBox(Item item){
            if (items.contains(item)){
                return true;
            }
            return false;
        }
}
