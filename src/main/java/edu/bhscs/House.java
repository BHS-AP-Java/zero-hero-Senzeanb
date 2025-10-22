package edu.bhscs;

public class House {
  // fields and properties// parts or essense of the house
  String corner;
  Street street;

  // Constructor(s)// makes the house
  public House() {
    System.out.println("digging a foundation....");

    System.out.println("...Framing the house...");
  }

  public House(String location, Street street) {
    this.corner = location;
    this.street = street;

    System.out.println("building the house on a  corenr " + location);
  }
  // Methods// skills or abilities of the house

}
