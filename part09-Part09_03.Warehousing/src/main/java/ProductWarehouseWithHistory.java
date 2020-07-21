
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
public class ProductWarehouseWithHistory extends ProductWarehouse {
    private ChangeHistory history= new ChangeHistory();
    
    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance){
        super(productName,capacity);
        super.addToWarehouse(initialBalance);
        history.add(initialBalance);
    }
    
    public String history(){
        return history.toString();
    }
    public void addToWarehouse(double amount){
       super.addToWarehouse(amount);
       this.history.add(super.getBalance());
    }
    
    public double takeFromWarehouse(double amount) {
        double store=this.getBalance();
        super.takeFromWarehouse(amount);
        this.history.add(super.getBalance());
        if (amount>this.getBalance()){
            return store;
        }
        return amount;
    }
    
    public void printAnalysis(){
        System.out.println("Product: "+super.getName());
        System.out.println("History: "+ history());
        System.out.println("Largest amount of product: "+history.maxValue());
        System.out.println("Smallest amount of product: "+history.minValue());
        System.out.println("Average: "+history.average());
    }
    
    
}
