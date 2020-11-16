/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author be-krishna
 */
public class ProductWarehouse extends Warehouse{
    private String name;

    public ProductWarehouse(String productName, double capacity) {
        super(capacity);
        this.name = productName;
    }

    public String getName() {
        return name;
    }

    public void setName(String productName) {
        this.name = productName;
    }

    @Override
    public String toString() {
        return this.getName() + ": "+ super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
