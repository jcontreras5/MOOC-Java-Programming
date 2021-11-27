
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jon
 */
public class Herd implements Movable{
    
    private ArrayList<Organism> herd;
    
    public Herd(){
        this.herd=new ArrayList<>();
    }

    @Override
    public String toString() {
       String herd="";
       for(Organism i: this.herd){
           herd+=i.toString()+"\n";
       }
       return herd;
    }
    
    

    public void addToHerd(Movable organism){
        this.herd.add((Organism) organism);
    }
    
    @Override
    public void move(int dx, int dy) {
        for(Organism organism:this.herd){
            organism.move(dx, dy);
        }
    }
    
}
