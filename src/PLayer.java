public abstract class PLayer {
    private String name;
    private int points = 200;
    
    public PLayer(String name) {
        this.name = name;
    }

    public String toString() {
        return name + " has " + points + " points";
    }
}
