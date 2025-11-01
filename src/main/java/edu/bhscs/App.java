package edu.bhscs;

public class App {
  public static void main(String[] arges) {
    date10_27();
  }

  public static void date10_27() {

    //System.out.println("what the ?!?!");
    Baker bob = new Baker("Bob");
    Cake bDay = bob.bakes(5, "chocolate");
    Table t = new Table(6, 25);
    bDay.draw(t);

    System.out.println("what the ?!?!");
    System.out.println("what the ?!?!");
    System.out.println("what the ?!?!");
    System.out.println("what the ?!?!");

  }
}
