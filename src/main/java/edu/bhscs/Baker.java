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

  public void takeJob(Store bakery) {
    if (p.getYesNo("Do you want to work at " + bakery.getName() + "?")) {
      this.placeOfWork = bakery;
      System.out.println(name + " now works at " + placeOfWork.getName());
    } else {
      System.out.println(name + " declined the job at " + bakery.getName());
    }
  }

  public void takeOrder(Customer c, PTSA ptsa) {
    int price = p.getInt("How much does the cake cost?");
    Cake cake = bakeCake();
    String symbol = p.giveAnswer("What symbol should I use to draw your cake?");
    int repeatCount = p.getInt("How many lines tall should your cake be?");
    

    cash += c.pay(price);
    ptsa.collectFunds(price);
    c.takeCake(cake);
  }



    public Cake bakeCake() {
    String type = p.giveAnswer("What type of cake should I bake?");
    char symbol = '#'; // default or ask player
    int layers = 3; // default or ask player
    Cake cake = new Cake(type, symbol, layers);
    System.out.println(name + " baked a " + cake.getType() + " cake!");
    return cake;
  }


  public int getCash() {
    return cash;
  }

  public Store getPlaceOfWork() {
    return placeOfWork;
  }
}
