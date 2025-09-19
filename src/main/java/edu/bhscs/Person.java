package edu.bhscs;

public class Person {
  private String name;
  private double money;
  private String jobTitle;
  private double hourlyWage;

  public Person(String name, double money) {
    this.name = name;
    this.money = money;
  }

  public Person(String name, double money, String jobTitle, double hourlyWage) {
    this.name = name;
    this.money = money;
    this.jobTitle = jobTitle;
    this.hourlyWage = hourlyWage;
  }

  public String getJobTitle() {
    return jobTitle;
  }

  public double getHourlyWage() {
    return hourlyWage;
  }

  public String getName() {
    return name;
  }

  public double getMoney() {
    return money;
  }

  public void buyCake(double price) {
    if (money >= price) {
      money -= price;
      System.out.println(name + " bought a cake for $" + price);
    } else {
      System.out.println(name + " does not have enough money to buy the cake.");
    }
  }
}
