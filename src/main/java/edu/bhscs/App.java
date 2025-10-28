package edu.bhscs;

public class App {
  public static void main(String[] arges) {
    date10_27();
  }

  public static void date10_27() {

    Baker bob = new Baker("Bob");
    Cake bDay = bob.bakes(5, "chocolate");
    Table t = new Table(4, 23);

    bDay.draw(t);
  }
}
