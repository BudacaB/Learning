
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bogdan
 */
public class Hand implements Comparable<Hand>{
    
    private List<Card> cards;

    public Hand() {
        this.cards = new ArrayList<>();
    }
    
    public void add(Card card) {
        cards.add(card);
    }
    
    public void print() {
        cards.forEach(c -> System.out.println(c));
    }
    
    public void sort() {
        Collections.sort(cards);
    }

    @Override
    public int compareTo(Hand hand) {
        int thisHandSum = cards.stream().map(c -> c.getValue()).reduce(0, Integer::sum);
        int handSum = hand.cards.stream().map(c -> c.getValue()).reduce(0, Integer::sum);
        
        return thisHandSum - handSum;
    }
    
    public void sortBySuit() {
        Collections.sort(cards, new BySuitInValueOrder());
    }
}
