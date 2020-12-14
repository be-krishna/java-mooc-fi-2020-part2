
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author be-krishna
 */
public class Box implements Packable{

    private double maxWeight;

    private ArrayList<Packable> items;

    public Box(double maxWeight) {
        this.maxWeight = maxWeight;
        this.items = new ArrayList<>();
    }

    public double weight() {
        double weight = 0;

        for (Packable item : items) {
            weight += item.weight();
        }
        return weight;
    }

    public void add(Packable item) {
        if ((weight() + item.weight()) > maxWeight) {
            return;
        }

        items.add(item);
    }

    @Override
    public String toString() {
        return "Box: " + this.items.size() + " items, total weight " + this.weight() + " kg";
    }

}
