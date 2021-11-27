
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
public class Box implements Packable{

    private ArrayList<Packable> box;
    private double maxWeight;

    @Override
    public double weight() {
        double weight = 0;
        for (Packable item : box) {
            weight += item.weight();
        }
        return weight;
    }

    public Box(double maxWeight) {
        this.box = new ArrayList<>();
        this.maxWeight = maxWeight;

    }

    public void add(Packable item) {
        if (this.weight() + item.weight() <= this.maxWeight) {
            this.box.add(item);   
        }
    }

    @Override
    public String toString() {
        return "Box: " + this.box.size() + " items, total weight " + this.weight() + " kg";
    }

}
