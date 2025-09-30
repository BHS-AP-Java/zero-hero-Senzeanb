package edu.bhscs;

// PTSA is parent student teacher association

public class PTSA {
  // 75% of the money made by the bakesale goes to PTSA, 25% for ingredients/shop
  private double totalMoney;
  // President and Treasurer fields
  private String president = "Mr. Reiber";
  private String treasurer = "Mr. Reiber";
  // Track how many years have passed
  private int yearsPassed = 0;

  // PTSA receives 75% of the money from a bake sale
  public void receiveMoney(double amount) {
    totalMoney += amount * 0.75;
  }

  // Returns the total money held by PTSA
  public double getTotalMoney() {
    return totalMoney;
  }

  // Returns the current president
  public String getPresident() {
    return president;
  }

  // Returns the current treasurer
  public String getTreasurer() {
    return treasurer;
  }

  // Simulates the passing of one year; after 4 years, Sen becomes president and treasurer
  public void passYear() {
    yearsPassed++;
    if (yearsPassed == 4) {
      president = "Sen";
      treasurer = "Sen";
    }
  }

  // Main method to test PTSA functionality
  public static void main(String[] args) {
    // Setup scenario: Sophia buys 3 blueberry cheesecakes for $300 total
    Customer sophia = new Customer("Sophia", 300.0);
    Baker baker = new Baker();
    PTSA ptsa = new PTSA();

    double totalSpent = 300.0;
    double cakePrice = totalSpent / 3;
    String cakeFlavor = "blueberry cheesecake";

    for (int i = 0; i < 3; i++) {
      if (sophia.buyCake(cakePrice)) {
        baker.sellCake();
      }
    }

    // Distribute money
    ptsa.receiveMoney(totalSpent);
    baker.receivePayment(totalSpent * 0.25);

    System.out.println("\n--- Transaction Summary ---");
    System.out.println("PTSA Total Money: $" + ptsa.getTotalMoney());
    System.out.println("PTSA President: " + ptsa.getPresident());
    System.out.println("Baker's Money: $" + baker.getMoney());
    System.out.println("Baker's Cakes Sold: " + baker.getCakesSold());
    System.out.println("Sophia's Money Left: $" + sophia.getMoney());
    System.out.println(
        "Sophia's Cakes Owned: " + sophia.getCakesOwned() + " (all " + cakeFlavor + ")");
    // Simulate 4 years passing
    for (int i = 0; i < 4; i++) {
      ptsa.passYear();
    }
    System.out.println("\nAfter 4 years...");
    System.out.println("PTSA President: " + ptsa.getPresident());
    System.out.println("PTSA Treasurer: " + ptsa.getTreasurer());
  }
}
