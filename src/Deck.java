public class Deck {
    DrawPile drawPile = new DrawPile();
    DiscardPile discPile = new DiscardPile();

    public static void createDeck(DrawPile deck) {
        
    }

    public void resetPiles(DrawPile deck, DiscardPile pile) {
        int count = 0;
        for (Ranks rank : rank) {
            for (Suits suit : suit) {
                cards[count] = new Card(rank, suit);
                count++;
            }
        }
    }

    public String getDrawPile(){
        return drawPile.toString();
    }

    public String getDiscardPile(){
        return discPile.toString();
    }
}
