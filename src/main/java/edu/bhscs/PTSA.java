package edu.bhscs;

public class PTSA {
  private double funds;

  public PTSA() {
    funds = 0;
  }

  public void collectFunds(double amount) {
    funds += amount;
    System.out.println("PTSA collected $" + amount + ". Total funds: $" + funds);
  }

  public double getFunds() {
    return funds;
  }
}
