package edu.bhscs;

public class Main {
  /*
   * GOALS: Simulate a bake sale. Baker bakes cakes, sells to Customer, PTSA collects funds. INPUT:
   * User decides cake type, cake price, and job choice. OUTPUT: Messages showing baker, cake,
   * customer, and PTSA changes. EDGE CASES: Negative price, customer can't afford, yes/no
   * variations.
   */

  public static void main(String[] args) {
    Player player = new Player();

    // Setup
    Flour flour = new Flour();
    Baker baker = new Baker(player.getName(), player, flour);
    Customer customer = new Customer("Alice");
    PTSA ptsa = new PTSA();
    Store bakery = new Store("Sweet Treats");

    System.out.println("\n--- WELCOME TO THE BAKE SALE SIMULATION ---\n");

    // Interactions
    baker.takeJob(bakery);
    baker.takeOrder(customer, ptsa);

    // Show final states
    System.out.println("\n--- FINAL STATUS ---");
    System.out.println("Baker cash: $" + baker.getCash());
    System.out.println("Customer has: " + customer.getCake());
    System.out.println("PTSA total funds: $" + ptsa.getFunds());
    System.out.println("Baker works at: " + baker.getPlaceOfWork());
  }
}
