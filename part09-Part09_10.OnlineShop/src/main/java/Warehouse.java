
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author be-krishna
 */
public class Warehouse {

    private Map<String, Integer> productPrices;
    private Map<String, Integer> productStock;

    public Warehouse() {
        this.productPrices = new HashMap<>();
        this.productStock = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock) {
        productPrices.put(product, price);
        productStock.put(product, stock);
    }

    public int price(String product) {
        if (productPrices.containsKey(product)) {
            return productPrices.get(product);
        }
        return -99;
    }

    public int stock(String product) {
        if (productStock.containsKey(product)) {
            return productStock.get(product);
        }
        return 0;
    }

    public boolean take(String product) {
        if (productStock.containsKey(product) && productStock.get(product) > 0) {
            productStock.put(product, productStock.get(product) - 1);
            return true;
        }
        return false;
    }
    
    public Set<String> products(){
        return productStock.keySet();
    }
}
