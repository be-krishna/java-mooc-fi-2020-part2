
import java.util.ArrayList;
import java.util.Collections;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author be-krishna
 */
public class ChangeHistory {

    private ArrayList<Double> history;

    public ChangeHistory() {
        this.history = new ArrayList<>();
    }

    public void add(double amount) {
        this.history.add(amount);
    }

    public void clear() {
        this.history.clear();
    }

    public double maxValue() {
        return Collections.max(history);
    }

    public double minValue() {
        return Collections.min(history);
    }

    public double average() {
        double sum = 0;
        for (double value : this.history) {
            sum += value;
        }

        return sum / this.history.size();
    }

    @Override
    public String toString() {
        return this.history.toString();
    }
}
