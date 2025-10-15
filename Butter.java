public class Butter extends Pastry {
    private boolean isSalted;
    private String texture;

    // No-argument constructor
    public Butter() {
        super();
        this.isSalted = false;
        this.texture = "Unknown";
    }

    // Parameterized constructor
    public Butter(String name, double price, int quantity, boolean isSalted, String texture) {
        super(name, price, quantity);
        this.isSalted = isSalted;
        this.texture = texture;
    }

    // Getters and Setters
    public boolean getIsSalted() {
        return isSalted;
    }

    public void setIsSalted(boolean isSalted) {
        this.isSalted = isSalted;
    }

    public String getTexture() {
        return texture;
    }

    public void setTexture(String texture) {
        this.texture = texture;
    }

    // toString() method
    public String toString() {
        return super.toString() + " Butter [isSalted = " + isSalted + ", texture = " + texture + "]";
    }
}