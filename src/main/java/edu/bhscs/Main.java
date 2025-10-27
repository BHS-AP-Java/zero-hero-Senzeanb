package edu.bhscs;

public class Main {

  /**
   * GOALS: - Simulate a bake sale with a Player, Baker, Customer, PTSA, and Cake. - All user input
   * handled through Player (encapsulation). INPUTS: - Cake type - Symbol for drawing - Number of
   * rows for drawing OUTPUTS: - Printed messages showing baking, selling, and drawing the cake.
   * EDGE CASES: - User enters 0 or negative values for rows or price.
   */
  public static void main(String[] args) {
    Player player = new Player();

    // create flour and baker
    Flour flour = new Flour("All-purpose flour");
    Baker baker = new Baker("Alice", player, flour);

    // create a customer
    Customer customer = new Customer("Bob", 100);

    // bake a cake
    Cake cake = baker.bakeCake();

    // show cake. details
    System.out.println("\nCake created: " + cake);

    // draw cake (assignment part)
    String symbol = player.giveAnswer("Enter a symbol to draw your cake:");
    int rows = player.getInt("Enter how many rows to draw:");
    cake.draw(symbol, rows);

    System.out.println("\nThank you for visiting the Bake Sale!");
  }
}
