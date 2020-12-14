
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author be-krishna
 */
public class Herd implements Movable {
    
    private List<Movable> herdOrganism;

    public Herd() {
        this.herdOrganism = new ArrayList<>();
    }    
    
    public void addToHerd(Movable movable){
        this.herdOrganism.add(movable);
    }

    @Override
    public void move(int dx, int dy) {
        for(Movable organism:herdOrganism){
            organism.move(dx, dy);
        }
    }

    @Override
    public String toString() {
        String herdPosition = "";
        
        for(Movable organisms:herdOrganism){
            herdPosition += organisms.toString() + "\n";
        }
        
        return herdPosition;
    }
    
    
}
