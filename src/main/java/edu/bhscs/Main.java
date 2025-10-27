package edu.bhscs;

public class Main {
  public static void main(String[] args) {
    // Create the Player
    Player player = new Player();

    // Ask player for cake properties
    String cakeType = player.giveAnswer("What type of cake should I bake?");
    char symbol = player.giveAnswer("Which symbol to draw your cake?").charAt(0);
    int layers = player.getInt("How many layers tall should the cake be?");

    // Create the Cake object
    Cake cake = new Cake(cakeType, symbol, layers);

    // Draw the cake
    cake.draw();

    // Optional: Customer buys the cake
    String customerName = player.giveAnswer("Enter customer name:");
    int customerCash = player.getInt("How much money does the customer have?");
    Customer customer = new Customer(customerName, customerCash);

    int price = player.getInt("Set the price of the cake:");
    int payment = customer.pay(price);
    if (payment > 0) {
      customer.takeCake(cake);
    }

    System.out.println("\nYour cake is ready to enjoy!");
  }
}
