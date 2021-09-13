public class Card {

    Suit suit;
    Face face;

    public Card(Suit suit, Face face) {
        this.suit = suit;
        this.face = face;
    }

    @Override
    public String toString() {
        return "Card{" +
                "suit=" + suit +
                ", face=" + face +
                '}';
    }
}
