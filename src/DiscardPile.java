import java.util.ArrayList;

public class DiscardPile extends Cards {
    private ArrayList<Card> discPile = new ArrayList<Card>();

    public DiscardPile() {

    }

    public String toString() {
        String currentPile = "";
        for (Card card : discPile) {
            currentPile += card+"\n";
        }
        return currentPile;
    }
}
