package edu.bhscs;

public class App {
  public static void main(String[] arges) {
    date10_27();
  }

  public static void date10_27() {
    Baker bob = new Baker("Bob");
    Table t = new Table(3, 25);
    Cake bDay = bob.bakes(5, "Suzzie");
    bDay.draw(t);

  }
  }

