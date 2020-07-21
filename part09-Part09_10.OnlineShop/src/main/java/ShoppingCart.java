
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ganesh
 */
public class ShoppingCart {
    private Map<String,Item> cart;
    
    public ShoppingCart(){
        this.cart=new HashMap<>();
    }
    
    public void add(String Product, int price){
        if (cart.containsKey(Product)){
            this.cart.get(Product).increaseQuantity();
        }else{
        Item item=new Item(Product,1,price);
        this.cart.put(Product,item);
        }
    }
    
    public int price(){
        int price=0;
        for (Item item: cart.values()){
            price+=item.price();
        }
        return price;
    }
    
    public void print(){
        for (Item item: cart.values()){
            System.out.println(item);
        }
    }
}
