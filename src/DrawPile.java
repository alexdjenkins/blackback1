import java.util.ArrayList;
import java.util.Arrays;

public class DrawPile extends Cards {
    private ArrayList<Card> drawPile = new ArrayList<>();

    public DrawPile() {
        resetPile();
        shuffleDeck();
    }

    public void resetPile() {
        drawPile.clear();
        drawPile.addAll(Arrays.asList(cards));
        shuffleDeck();
    }

    public void shuffleDeck() {
        ArrayList<Card> shuffledPile = new ArrayList<Card>();
        while (!drawPile.isEmpty()) {
            int randIndex = (int)(Math.random() * drawPile.size());
            shuffledPile.add(drawPile.remove(randIndex));
        }
        drawPile = shuffledPile;
    }

    public String toString() {
        String currentPile = "";
        for (Card card : drawPile) {
            currentPile += card+"\n";
        }
        return currentPile;
    }
}
