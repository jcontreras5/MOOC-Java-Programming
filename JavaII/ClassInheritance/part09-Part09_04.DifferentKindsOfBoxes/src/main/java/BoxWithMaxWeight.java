
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jon
 */
public class BoxWithMaxWeight extends Box{
    
    private int maxWeight;   
    private ArrayList<Item> items;
    
    
    public BoxWithMaxWeight(int max){
        this.maxWeight=max;
        this.items=new ArrayList<>();
        
    }
    
    @Override
    public  boolean isInBox(Item item){
        if(this.items.contains(item)){
            return true;
        }
        return false;
    }

    @Override
    public void add(Item item) {
        int currentweight=0;
        for(Item i:this.items){
            currentweight+=i.getWeight();
        }
        
        if(currentweight+item.getWeight()<=this.maxWeight){
            this.items.add(item);
        }
        
    }
    
    
}
