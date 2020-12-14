/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author be-krishna
 */
public class OneItemBox extends Box {

    private Item oneItem;

    public OneItemBox() {
    }

    @Override
    public void add(Item item) {
        if (oneItem != null) {
            return;
        }
        this.oneItem = item;
    }

    @Override
    public boolean isInBox(Item item) {
        if (!(this.oneItem == null) && this.oneItem.equals(item)) {
            return true;
        }
        return false;
    }

}
