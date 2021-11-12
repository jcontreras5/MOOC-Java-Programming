
import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jon
 */
public class StorageFacility {
    private HashMap<String,ArrayList<String>> storage;
    
    public StorageFacility(){
        this.storage=new HashMap<>();
    }
    
    public void add(String unit, String item){
        if (this.storage.containsKey(unit)){
            this.storage.get(unit).add(item);
        }
        else{
            this.storage.put(unit,new ArrayList<>());
            this.storage.get(unit).add(item);
        }
    }
            
    public ArrayList<String> contents(String storageUnit){
        if(this.storage.get(storageUnit).isEmpty()){
            return new ArrayList<>();
        }
        else{
            return this.storage.get(storageUnit);
        }
    }        
    
    public void remove(String storageUnit, String item){
        if(this.storage.get(storageUnit).size()>1)
            this.storage.get(storageUnit).remove(item);
        else{
            this.storage.remove(storageUnit);
        }
    }
            
    public ArrayList<String> storageUnits(){
        ArrayList<String> units=new ArrayList<>();
        for (String unit:this.storage.keySet())
            if(!this.storage.get(unit).isEmpty()){
                units.add(unit);
            }
        return units;
    }
            
}
