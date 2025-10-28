package edu.bhscs;

public class Table {
  // fields and properties
  int legs;
  int width;

  // Constructor
  public Table(int legs, int width) {
    this.legs = legs;
    this.width = width;
    System.out.println("My table is alive! width legs: " + legs);
  }

  // Draw the table using for loops
  public void draw() {
    // Draw the tabletop
    System.out.print("  ");
    for (int i = 0; i < width; i++) {
      System.out.print("=");
    }
    System.out.println();
    System.out.println(this.legs);
    // Draw the legs
    for (int i = 0; i < this.legs; i++) {

      System.out.print(" |");
/* 
      for (int j = 0; j < width/this.legs - 1; j++) {

        System.out.print(" ");
      }
      System.out.println("|");*/
    }

    // Draw the table base
    System.out.print("  ");
    for (int i = 0; i < width; i++) {
      System.out.print("-");
    }
    System.out.println();
  }
}
