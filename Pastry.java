public class Pastry {
    private String name;
    private double price;
    private int quantity;

    // No-argument constructor
    public Pastry() {
        this.name = "Unknown";
        this.price = 0.0;
        this.quantity = 0;
    }

    // Parameterized constructor
    public Pastry(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
  
    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // toString() method
    public String toString() {
        return "Pastry [name = " + name + ", price = $" + price + ", quantity = " + quantity + "]";
    }
}