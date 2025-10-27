package edu.bhscs;

public class Customer {
  private String name;
  private Cake cake;
  private double cash;

  public Customer(String name) {
    this.name = name;
    this.cash = 50.0;
  }

  public double pay(double price) {
    if (price > cash) {
      System.out.println(name + " doesn't have enough money! Paying remaining $" + cash);
      double temp = cash;
      cash = 0;
      return temp;
    }
    cash -= price;
    return price;
  }

  public void takeCake(Cake cake) {
    this.cake = cake;
    System.out.println(name + " received a " + cake.getType() + " cake!");
  }

  public Cake getCake() {
    return cake;
  }
}
