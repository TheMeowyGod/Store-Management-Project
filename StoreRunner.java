public class StoreRunner {
    public static void main(String[] args) {
        // Create Chocolate and Butter pastries
      Chocolate truffle = new Chocolate("Dark Chocolate Truffle", 3.50, 25, "Dark", true);
      Butter croissant = new Butter("Butter Croissant", 2.75, 40, true, "Flaky");
      
      // Display pastry details
      System.out.println(truffle);
      System.out.println(croissant);

      //test orders
      Chocolate order1 = new Chocolate("Dark Chocolate Eclair", 4.25, 10, "Dark", true);
      Butter order2 = new Butter("Classic Butter Croissant", 3.00, 15, false, "Flaky");
      Chocolate order3 = new Chocolate("Milk Chocolate Tart", 5.50, 8, "Milk", false);

      //print orders
      System.out.println(order1);
      System.out.println(order2);
      System.out.println(order3);
    }
}