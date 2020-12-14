
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
public class BoxWithMaxWeight extends Box {

    private int maxWeight;
    private ArrayList<Item> contents;

    public BoxWithMaxWeight(int capacity) {
        this.maxWeight = capacity;
        this.contents = new ArrayList<>();
    }

    public int getCurrentWeight() {
        int weight = 0;
        for(Item item:this.contents){
            weight += item.getWeight();
        }
        return weight;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    @Override
    public boolean isInBox(Item item) {
        if (this.contents.contains(item)) {
            return true;
        }
        return false;
    }

    public void print() {
        for (Item item : contents) {
            System.out.println(item.getName());
        }
    }

    @Override
    public void add(Item item) {
        if ((item.getWeight() + getCurrentWeight()) <= getMaxWeight()) {
            this.contents.add(item);
        }
    }

}
