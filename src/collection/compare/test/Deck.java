package collection.compare.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

    private List<Card> cards = new ArrayList<>();
    
    public Deck() {
        init();
        suffle();
    }

    private void suffle() {
        Collections.shuffle(cards);
    }

    private void init() {
        for (int i = 1; i <= 13; i++) {
            for (Suit suit : Suit.values()) {
                cards.add(new Card(i, suit));
            }
        }
    }

    public Card draw() {
//        return cards.remove(0);
        return cards.removeFirst();     //java 21부터
    }
}
