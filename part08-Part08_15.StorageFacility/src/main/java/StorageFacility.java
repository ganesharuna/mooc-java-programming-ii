
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
public class StorageFacility {
    private HashMap<String, ArrayList<String>> list;
    
    public StorageFacility(){
        this.list=new HashMap<>();
    }
    
    public void add(String unit, String item){
        this.list.putIfAbsent(unit, new ArrayList<>());
        this.list.get(unit).add(item);
    }
    
    public ArrayList<String> contents(String storageUnit){
         return list.getOrDefault(storageUnit, new ArrayList<>());
    }
    
    public void remove(String storageUnit, String item){
          this.list.get(storageUnit).remove(item);
          if (this.list.get(storageUnit).isEmpty()){
              this.list.remove(storageUnit);
          }
    }
    
    public ArrayList<String> storageUnits(){
        ArrayList<String> units=new ArrayList<>();
        for (String key: list.keySet()){
        units.add(key);
    }
        return units;
    }
}
