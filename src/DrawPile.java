import java.util.ArrayList;

public class DrawPile extends Cards {
    private ArrayList<Card> DrawPile = new ArrayList<Card>();

    public DrawPile() {
        for (Card card : cards) {
            DrawPile.add(card);
        }
        shuffleDeck();
    }

    public void shuffleDeck() {
        ArrayList<Card> newDeck = new ArrayList<Card>();
        for (Card card : DrawPile) {
            newDeck.add(card);
        }
    }

    public String toString() {
        String currentPile = "";
        for (Card card : DrawPile) {
            currentPile += card+"\n";
        }
        return currentPile;
    }
}
