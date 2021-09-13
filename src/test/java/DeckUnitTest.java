import org.junit.jupiter.api.*;

public class DeckUnitTest {

    Deck deck;

    @BeforeEach
    public void init() {
        deck = new Deck();
    }

    @Test
    public void testShouldDealCard() {
        int numberOfCards = deck.cards.size();
        Card card = deck.dealOneCard();

        Assertions.assertNotNull(card);
        Assertions.assertEquals(numberOfCards-1, deck.cards.size());
    }

    @Test
    public void testNotShouldDealCard() {
        deck.cards.clear();
        Card card = deck.dealOneCard();

        Assertions.assertNull(card);
    }

}
