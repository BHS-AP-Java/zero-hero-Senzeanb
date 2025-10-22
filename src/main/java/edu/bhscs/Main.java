package edu.bhscs;

public class Main {
  public static void main(String[] args) {
    Street dividion = new Street("Division St.");
    Street chestnut = new Street("chest nut lane");
    chestnut.intersect(dividion);
    division.develop("NE");
    division.develop("SE");
    division.develop("SW");
    division.develop("NW");



  }
}
