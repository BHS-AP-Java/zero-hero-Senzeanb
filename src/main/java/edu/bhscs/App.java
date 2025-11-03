package edu.bhscs;

public class App {
  public static void main(String[] arges) {
    date10_27();
  }

  public static void date10_27() {

    Baker bob = new Baker("Bob");
    System.out.println("Baker: Bob bakes a cake for: Sen");
    Cake bDay = bob.bakes(4, "chocolate");
    Cake myCake = new Cake();

    Table myTable = new Table(4, 77);
    myCake.draw(myTable);
  }
}
