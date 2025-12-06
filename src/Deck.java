public class Deck {
    public final int NUM_CARDS = 52;
    DrawPile drawPile = new DrawPile();
    DiscardPile discPile = new DiscardPile();


    public static void createDeck(DrawPile deck) {
        
    }

    public void resetPiles(DrawPile deck, DiscardPile pile) {
        
    }

    public String getDrawPile(){
        return drawPile.toString();
    }

    public String getDiscardPile(){
        return discPile.toString();
    }
}
