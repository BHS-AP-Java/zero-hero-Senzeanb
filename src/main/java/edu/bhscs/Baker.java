package edu.bhscs;

public class Baker {
  private double money;
  private int cakesSold;

  public Baker() {
    this.money = 0.0;
    this.cakesSold = 0;
  }

  public void receivePayment(double amount) {
    money += amount;
  }

  public void sellCake() {
    cakesSold++;
  }

  public double getMoney() {
    return money;
  }

  public int getCakesSold() {
    return cakesSold;
  }
}
