import java.util.Random;
import java.util.Stack;

public class Deck {

    Stack<Card> cards;

    public Deck() {
        cards = new Stack<>();
        for(Suit suit: Suit.values()) {
            for (Face face: Face.values()) {
                Card card = new Card(suit, face);
                cards.add(card);
            }
        }
    }

    public void shuffle() {
        Random random = new Random();
        for (int i = cards.size() - 1; i > 0; i--) {
            int randomIndex = random.nextInt(i + 1);
            Card c = cards.get(i);
            cards.set(i, cards.get(randomIndex));
            cards.set(randomIndex, c);
        }
    }

    public Card dealOneCard() {
        if (cards.isEmpty()) return null;
        return cards.pop();
    }

}
