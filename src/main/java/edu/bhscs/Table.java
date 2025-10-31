package edu.bhscs;

public class Table {
  private int legs;
  private int width;
  private String legSymbol = "|";
  private String topSymbol = "-";

  public Table(int legs, int width) {
    this.legs = legs;
    this.width = width;
    System.out.println("My table is alive");
  }

  public void setLegs(String legSymbol) {
    this.legSymbol = legSymbol;
  }

  public void setTop(String topSymbol) {
    this.topSymbol = topSymbol;
  }

  public void draw() {
    // Draw the top of the table
    for (int i = 0; i < width; i++) {
      System.out.print(topSymbol);
    }
    System.out.println();

    // Draw the legs evenly spaced (including both ends)
    for (int i = 0; i < width; i++) {
      // Calculate position of each leg
      boolean drawLeg = false;

      for (int l = 0; l < legs; l++) {
        int legPos = (int) Math.round((double) l * (width - 1) / (legs - 1));
        if (i == legPos) {
          drawLeg = true;
          break;
        }
      }

      if (drawLeg) {
        System.out.print(legSymbol);
      } else {
        System.out.print(" ");
      }
    }
    System.out.println();
    System.out.println():
  }
}
