
import java.util.ArrayList;
import java.util.Collections;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Jon
 */
public class ChangeHistory {

    private ArrayList<Double> changes;

    public ChangeHistory() {
        this.changes = new ArrayList<>();
    }

    public void add(double status) {
        this.changes.add(status);
    }

    public void clear() {
        this.changes.clear();
    }

    public double minValue() {
        if (this.changes.isEmpty()) {
            return 0;
        } else {
            return Collections.min(this.changes);
        }
    }

    public double maxValue() {
        if (this.changes.isEmpty()) {
            return 0;
        } else {
            return Collections.max(this.changes);
        }
    }

    public double average() {
        if (this.changes.isEmpty()) {
            return 0;
        }
        
        double sum = 0;
        for (double i : this.changes) {
            sum += i;
        }
        return (sum / this.changes.size());
    }
    
    public String toString(){
        return this.changes.toString();
    }
}
