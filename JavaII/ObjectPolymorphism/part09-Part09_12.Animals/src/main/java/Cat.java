/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jon
 */
public class Cat extends Animal {
    
    
    public Cat(){
        super("Cat");
    }
    
    public Cat(String name) {
         super(name);
    }

    @Override
    public void makeNoise() {
        this.purr();
    }
    
    public void purr(){
        System.out.println(super.getName()+" purrs");
    }
    
    

   
    
}
