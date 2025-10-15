public class Chocolate extends Pastry {
    private String cocoaType;
    private boolean hasFilling;

    // No-argument constructor
    public Chocolate() {
        super();
        this.cocoaType = "Unknown";
        this.hasFilling = false;
    }

    // Parameterized constructor
    public Chocolate(String name, double price, int quantity, String cocoaType, boolean hasFilling) {
        super(name, price, quantity);
        this.cocoaType = cocoaType;
        this.hasFilling = hasFilling;
    }

    // Getters and Setters
    public String getCocoaType() {
        return cocoaType;
    }

    public void setCocoaType(String cocoaType) {
        this.cocoaType = cocoaType;
    }

    public boolean getHasFilling() {
        return hasFilling;
    }

    public void setHasFilling(boolean hasFilling) {
        this.hasFilling = hasFilling;
    }

    // toString() method
    public String toString() {
        return super.toString() + " Chocolate [cocoaType = " + cocoaType + ", hasFilling = " + hasFilling + "]";
    }
}