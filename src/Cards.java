public class Cards extends Deck {
    public static Ranks[] rank = {Ranks.ACE, Ranks.TWO, Ranks.THREE, Ranks.FOUR, Ranks.FIVE, 
                                    Ranks.SIX, Ranks.SEVEN, Ranks.EIGHT, Ranks.NINE, Ranks.TEN, 
                                    Ranks.JACK, Ranks.QUEEN, Ranks.KING};
    public static Suits[] suit = {Suits.HEARTS, Suits.DIAMONDS, Suits.CLUBS, Suits.SPADES};
    public Card[] cards = new Card[NUM_CARDS];

    public Cards() {
        int count = 0;
        for (Ranks rank : rank) {
            for (Suits suit : suit) {
                cards[count] = new Card(rank, suit);
                count++;
            }
        }
    }
    
    public String toString() {
        String cardsString = "";
        for (Card card : cards) {
            cardsString += card+"\n";
        }
        return cardsString;
    }
}
