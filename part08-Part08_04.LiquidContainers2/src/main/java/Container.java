/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author be-krishna
 */
public class Container {

    private int amount;

    public Container() {
        this.amount = 0;
    }

    public int contains() {
        return amount;
    }

    public void add(int amount) {
        if (!(amount < 0)) {
            if ((this.amount + amount) > 100) {
                this.amount = 100;
                return;
            }
            this.amount += amount;
        }
    }

    public void remove(int amount) {
        if (!(amount < 0)) {
            if ((amount > this.amount)) {
                this.amount = 0;
                return;
            }
            this.amount -= amount;
        }
    }

    public void move(int amount, Container secondContainer) {
        if (this.amount <= 0) {
            return;
        }

        if (amount >= this.amount) {
            secondContainer.add(this.amount);
            this.amount = 0;
            return;
        }

        secondContainer.add(amount);
        this.remove(amount);
    }

    @Override
    public String toString() {
        return this.contains() + "/100";
    }

}
