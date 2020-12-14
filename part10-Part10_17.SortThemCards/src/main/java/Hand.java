
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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
public class Hand implements Comparable<Hand>{
    private List<Card> hand;

    public Hand() {
        this.hand = new ArrayList<>();
    }

    public void add(Card card){
        this.hand.add(card);
    }
    
    public void print(){
        hand.stream().forEach(card -> System.out.println(card));
    }
    
    public int handValue(){
        int value = hand.stream().mapToInt(card-> card.getValue()).sum();
        return value;
    }
    
    public void sort(){
        Comparator<Card> comparator = Comparator.comparing(Card::getValue).thenComparing(Card::getSuit);
        Collections.sort(hand, comparator);
    }
    
    public void sortBySuit(){
        Collections.sort(hand, new BySuitInValueOrder());
    }

    @Override
    public int compareTo(Hand cHand) {
        if(this.handValue() == cHand.handValue()){
            return 0;
        }else if(this.handValue() > cHand.handValue()){
            return 1;
        }else{
            return -1; 
        }
    }
    
}
