package edu.bhscs;

public class Customer {
  private String name;
  private double money;
  private int cakesOwned;

  public Customer(String name, double money) {
    this.name = name;
    this.money = money;
    this.cakesOwned = 0;
  }

  public String getName() {
    return name;
  }

  public double getMoney() {
    return money;
  }

  public int getCakesOwned() {
    return cakesOwned;
  }

  public boolean buyCake(double price) {
    if (money >= price) {
      money -= price;
      cakesOwned++;
      System.out.println(name + " bought a cake for $" + price);
      return true;
    } else {
      System.out.println(name + " does not have enough money to buy the cake.");
      return false;
    }
  }
}
