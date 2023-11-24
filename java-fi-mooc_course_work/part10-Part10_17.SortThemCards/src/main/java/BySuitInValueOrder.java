
import java.util.Comparator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bogdan
 */
public class BySuitInValueOrder implements Comparator<Card> {

    @Override
    public int compare(Card c1, Card c2) {
        int suitCompare = c1.getSuit().ordinal() - c2.getSuit().ordinal();
        
        if (suitCompare != 0) return suitCompare;
        
        return c1.compareTo(c2);
    }
    
}
