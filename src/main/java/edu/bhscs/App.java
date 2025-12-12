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

    Table myTable = new Table(7, 65);
    myCake.draw(myTable);

    // making a cake for another person
    System.out.println("\nBaker: Bob bakes a cake for: Amy");
    Cake amysCake = bob.bakes(6, "strawberry");
    Table amyTable = new Table(4, 40);
    amyTable.setLegs("I");
    amysCake.draw(amyTable);

    // make amy's age 7
    amysCake.draw("Amy", "7", 10);
  }
}
