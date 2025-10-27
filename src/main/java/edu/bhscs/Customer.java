package edu.bhscs;

public class Customer {
  private String name;
  private int cash;
  private Cake cake;

  public Customer(String name, int cash) { // constructor defined now
    this.name = name;
    this.cash = cash;
  }

  public int pay(int amount) {
    if (cash >= amount) {
      cash -= amount;
      System.out.println(name + " paid $" + amount);
      return amount;
    } else {
      System.out.println(name + " doesn't have enough money!");
      return 0;
    }
  }

  public void takeCake(Cake cake) {
    this.cake = cake;
    System.out.println(name + " received their " + cake.getType() + " cake!");
  }
}
