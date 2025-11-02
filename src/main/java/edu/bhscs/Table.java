package edu.bhscs;

public class Table {
  private int legs;
  private int width = 99;
  private String legSymbol = "|";
  private String topSymbol = "~";
  private String bottomSymbol = "-";

  public Table(int legs, int width) {
    this.legs = legs;
    this.width = width;

    
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
        int legPos;
        if (legs <= 1) {
          legPos = 0;
        } else {
          legPos = (int) Math.round((double) l * (width - 1) / (legs - 1));
        }
        if (i == legPos) {
          drawLeg = true;
          break;
        }
      }

      if (drawLeg) {
        System.out.print(legSymbol);
      } else {
        System.out.print(" ");
      }// Can youhear me?

    }
    System.out.println();
    // Draw the bottom of the table
    for (int i = 0; i < width; i++) {
      System.out.print(bottomSymbol);
    }

    System.out.println();
  }

  public void draw(int offset) {
    System.out.print(offset);
    for (int i = 0; i < offset; i++) {
      System.out.print(i);
    }
    this.draw();
  }



  // Draws the table with a cake string centered on the top.
  public void draw(String cake) {
    // Compute cake width in code points (better than length() for surrogate pairs)
    int cakeWidth = (cake != null) ? cake.codePointCount(0, cake.length()) : 0;

    // If there's no cake, draw the normal top
    if (cake == null || cakeWidth == 0) {
      for (int i = 0; i < width; i++) {
        System.out.print(topSymbol);
      }
      System.out.println();
    } else {
      // Center the cake within the repeated topSymbol slots
      int leftPad = Math.max(0, (width - cakeWidth) / 2);
      int rightPad = Math.max(0, width - cakeWidth - leftPad);

      for (int i = 0; i < leftPad; i++) {
        System.out.print(topSymbol);
      }
      System.out.print(cake);
      for (int i = 0; i < rightPad; i++) {
        System.out.print(topSymbol);
      }
      System.out.println();
    }

    // Draw the legs evenly spaced (including both ends)
    for (int i = 0; i < width; i++) {
      boolean drawLeg = false;

      for (int l = 0; l < legs; l++) {
        int legPos;
        if (legs <= 1) {
          legPos = 0;
        } else {
          legPos = (int) Math.round((double) l * (width - 1) / (legs - 1));
        }
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
    // Draw the bottom of the table
    for (int i = 0; i < width; i++) {
      System.out.print(bottomSymbol);
    }
    System.out.println();



  }

  public int getWidth() {
    return this.width;
  }
}


