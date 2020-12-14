/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author be-krishna
 */
public class Item {

    private String product;
    private int qty;
    private int unitPrice;

    public Item(String product, int qty, int unitPrice) {
        this.product = product;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }

    public Item(String product, int price) {
        this(product, 1, price);
    }

    public int price() {
        return qty * unitPrice;
    }

    public void increaseQuantity() {
        this.qty += 1;
    }

    @Override
    public String toString() {
        return this.product + ": " + this.qty;
    }

}
