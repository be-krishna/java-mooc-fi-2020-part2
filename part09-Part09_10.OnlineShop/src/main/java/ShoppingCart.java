
import java.util.HashMap;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author be-krishna
 */
public class ShoppingCart {

    private Map<String, Item> cartItems;

    public ShoppingCart() {
        this.cartItems = new HashMap<>();
    }

    public void add(String product, int price) {
        if (cartItems.containsKey(product)) {
            cartItems.get(product).increaseQuantity();
            return;
        }
        cartItems.put(product, new Item(product, price));
    }

    public int price() {
        int totalPrice = 0;

        for (Item item : cartItems.values()) {
            totalPrice += item.price();
        }

        return totalPrice;
    }

    public void print() {
        for (Item item : cartItems.values()) {
            System.out.println(item);
        }
    }
}
