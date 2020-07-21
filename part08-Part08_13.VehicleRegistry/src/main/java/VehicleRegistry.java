
import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ganesh
 */
public class VehicleRegistry {
    private HashMap<LicensePlate, String> owners;
    
    public VehicleRegistry(){
    this.owners=new HashMap<>();
    }
    
    public boolean add(LicensePlate licensePlate, String owner){
        if (!(owners.containsKey(licensePlate))){
            owners.put(licensePlate, owner);
            return true;
        }
        return false;
    }
    
    public String get(LicensePlate licensePlate){
        if ((owners.containsKey(licensePlate))){
            return owners.get(licensePlate);
        }
        return null;
    }
    
    public boolean remove(LicensePlate licensePlate){
        if ((owners.containsKey(licensePlate))){
            owners.remove(licensePlate);
            return true;
        }
        return false;
    }
    
    public void printLicensePlates(){
        for (LicensePlate key: owners.keySet()){
            System.out.println(key);
        }
    }
    
    public void printOwners(){
        ArrayList <String> list=new ArrayList<>();
        for (LicensePlate key: owners.keySet()){
            if (list.contains(owners.get(key))){
                continue;
            }
            System.out.println(owners.get(key));
            list.add(owners.get(key));
    }
}
}
