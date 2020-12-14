/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author be-krishna
 */
public class TripleTacoBox implements TacoBox {

    private int taco;

    public TripleTacoBox() {
        this.taco = 3;
    }

    @Override
    public int tacosRemaining() {
        return this.taco;
    }

    @Override
    public void eat() {
        if (!(this.taco <= 0)) {
            this.taco -= 1;
        }
    }

}
