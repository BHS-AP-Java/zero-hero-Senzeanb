package edu.bhscs;

public class Street {
  // fields and properties// parts or essense of the street
  String name;
  Street crossStreet;

  House houseNE;
  House houseSE;
  House houseSW;
  House houseNW;

  // Constructor(s)// makes the street
  public Street() {
    System.out.println("....Ploughing the dirt....");

    System.out.println("...now I have a street...");
  }

  public Street(String name) {
    this.name = name;
    this.name = name;
    System.out.println("I just put the name " + name + " on the sign");
    System.out.println("2nd street name" + name);
  }

  // Methods// skills or abilities of the street
  void intersect(Street other) {
    if (this.crossStreet == null) {
      this.crossStreet = other;
    } else return;
    this.crossStreet = other;
    other.intersect(this);
    System.out.println("lets put a stop sign here");
    System.out.println("and a street sign for " + other.name);
  }

  House develop(String corner) {
    if (corner.equals("NE")) {

      this.houseNE = new House(corner, this);
      return this.houseNE;
    }

    if (corner.equals("SE")) {
      this.houseSE = new House(corner, this);
      return this.houseSE;
    }
    if (corner.equals("SW")) {
      this.houseSW = new House(corner, this);
      return this.houseSW;
    } else {
      this.houseNW = new House(corner, this);
      return this.houseNW;
    }
  }
}
