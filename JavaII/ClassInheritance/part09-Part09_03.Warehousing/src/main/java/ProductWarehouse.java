
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
public class ProductWarehouse extends Warehouse{
    
    private String productName;
    
    public ProductWarehouse(String productName, double capacity){
        super(capacity);
        this.productName=productName;
    }

    public String getName(){
        return this.productName;
    }
    
    public void setName(String newName){
        this.productName=newName;
    }
    
    public String toString(){
        return this.getName()+": "+ super.toString();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.productName);
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
        final ProductWarehouse other = (ProductWarehouse) obj;
        if (!Objects.equals(this.productName, other.productName)) {
            return false;
        }
        return true;
    }
    
    
}
