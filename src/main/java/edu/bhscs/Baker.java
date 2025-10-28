package edu.bhscs;

public class Baker {
  private Player p;
  private Flour f;
  private Store placeOfWork;
  private int cash;
  private String name;

  public Baker(String name, Player p, Flour f) {
    this.name = name;
    this.p = p;
    this.f = f;
    this.cash = 0;
  }

  // Constructor
  Baker(String name) {
    this.name = name;
  }

  public Baker(Player p) {
    this.p = p;
  }

  // Job method
  public void takeJob(Store bakery) {
    if (p.getYesNo("Do you want to work at " + bakery.getName() + "?")) {
      this.placeOfWork = bakery;
      System.out.println(name + " now works at " + bakery.getName());
    } else {
      System.out.println(name + " declined the job at " + bakery.getName());
    }
  }

  // Take order from a customer
  public void takeOrder(Customer c, PTSA ptsa) {
    int price = p.getInt("How much does the cake cost?");

    // Ask cake details
    String type = p.giveAnswer("What type of cake should I bake?");
    String frosting = p.giveAnswer("What frosting do you want on your cake?");
    int layers = p.getInt("How many layers should the cake have?");

    Cake cake = new Cake(type, frosting, layers); // matches Cake constructor

    // Ask Player for drawing options
    String playerName = p.giveAnswer("Enter your name for the cake:");
    String playerAge = p.giveAnswer("Enter your age for the cake:");

    // Draw the cake
    cake.draw(playerName, playerAge);

    // Complete transaction
    cash += c.pay(price);
    ptsa.collectFunds(price);
    c.takeCake(cake);

    System.out.println(name + " now has $" + cash);
  }

  public int getCash() {
    return cash;
  }

  public Store getPlaceOfWork() {
    return placeOfWork;
  }

  public Cake bakes(int layers) {
    String type = p.giveAnswer("What type of cake?"); // now type is defined locally
    String frosting = p.giveAnswer("What frosting do you want?");
    return new Cake(type, frosting, layers);
  }


  public Cake bakes() {
    int layers = 5; // define locally
    String type = "Chocolate"; // define locally
    String frosting = "Vanilla";
    return new Cake(type, frosting, layers);
}

public Cake bakes(int layers, String type) {
  String frosting = "Vanilla"; // or get from Player input
  return new Cake(type, frosting, layers);
}



  }




