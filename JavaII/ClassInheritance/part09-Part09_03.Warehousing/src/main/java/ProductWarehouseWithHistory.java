
import java.util.Objects;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jon
 */
public class ProductWarehouseWithHistory extends ProductWarehouse {
    private ChangeHistory change;
    
    
    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance){
        super(productName,capacity);
        super.addToWarehouse(initialBalance);
        this.change=new ChangeHistory();
        this.change.add(initialBalance);
    }
    
    
    public String history(){
        return this.change.toString();
    }
    
    public void addToWarehouse(double amount){
        super.addToWarehouse(amount);
        this.change.add(super.getBalance());
    }
    
    public double takeFromWarehouse(double amount){
        if(amount<=super.getBalance()){
            super.takeFromWarehouse(amount);
            this.change.add(super.getBalance());
            return super.getBalance();
        }
        else{
            super.takeFromWarehouse(super.getBalance());
            this.change.add(super.getBalance());
            return super.getBalance();
        }
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.change);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ProductWarehouseWithHistory other = (ProductWarehouseWithHistory) obj;
        if (!Objects.equals(this.change, other.change)) {
            return false;
        }
        return true;
    }
    
    public void printAnalysis(){
        System.out.println("Product: "+super.getName()+"\nHistory: "+this.history()+"\nLargest amount of product: "+ this.change.maxValue()+"\nSmallest amount of product: "+this.change.minValue()+"\nAverage: "+this.change.average());
    }
    
    
}
