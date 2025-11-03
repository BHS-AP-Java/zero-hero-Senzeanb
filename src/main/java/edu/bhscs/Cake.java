package edu.bhscs;

public class Cake {

  // properties
  private String frosting = "vanilla";
  int layers = 4;
  String type = "Chocolate";
  int width = 10;
  int height = 4;

  // Constructor
  public Cake(String type, String frosting, int layers) {
    this.type = type;
    this.frosting = frosting;
    this.layers = layers;
  }

  public Cake(int i, String string) {
    // TODO Auto-generated constructor stub
  }

  // defqult constructor
  public Cake() {}

  // Getters
  public String getType() {
    return type;
  }

  public String getFrosting() {
    return frosting;
  }

  public int getLayers() {
    return layers;
  }

  // Draw the cake with two inputs from player
  public void draw(String playerName, String playerAge, int offset) {
    for (int i = 0; i < offset; i++) {
      System.out.print(i);
    }
    System.out.print(offset);
    System.out.println(" Cake for " + playerName + " (Age: " + playerAge + ")\n");
    // Draw candles

    // Cake info
    System.out.println("Type: " + type + " | Frosting: " + frosting);
  }

  public void draw(Table t) {

    // TODO cebterung, I need info

    //
    // Lets draw the othefr guys with that info
    int tablewidth = t.getWidth();
    int cakeWidth = this.width;
    int tableOffset = 0;
    int cakeoffset = 0;
    int offset = 0;

    offset = (tablewidth - cakeWidth) / 2;
    if (tablewidth > cakeWidth) {
      tableOffset = 0;
      cakeoffset = Math.abs(offset);
    } else {
      tableOffset = Math.abs(offset);
      cakeoffset = 0;
    }
    // First I will draw this cake on top!
    this.draw(cakeoffset);

    // The i will draw the table under it
    t.draw(tableOffset);

    System.out.println(t.getWidth());
    System.out.println("Type: " + type + " | Frosting: " + frosting);
    // Draw a simple 3D-ish cake on the table
    System.out.println("\n Your cake is on the table!\n");

    // Well.... I need to draw the cake first.... cause it is on top.
    this.draw("Sen ", "17", cakeoffset);

    // then I will need to draw the table
    t.draw(tableOffset);

    // the tricky bit... I will want the table or the cake to be offset some amount... which is
    // hard.

    // Draw centered cake
    int tableWidth = t.getWidth();
    cakeWidth = layers * 4 + 2; // approximate visible width of cake
    offset = (tableWidth - cakeWidth) / 2;

    // Adjust left if it’s slightly off-center
    if ((tableWidth - cakeWidth) % 2 != 0) {
      offset -= 1;
    }
    if (offset < 0) offset = 0;

    for (int i = 1; i <= layers; i++) {
      // print spaces before the cake line
      for (int s = 0; s < offset + (layers - i); s++) {
        System.out.print(" ");
      }
      System.out.print("/");
      for (int j = 0; j < i * 4; j++) {
        System.out.print("#");
      }
      System.out.println("\\");
    }

    // Base frosting line
    for (int s = 0; s < offset; s++) {
      System.out.print(" ");
    }
    System.out.print("|");
    for (int j = 0; j < layers * 4; j++) {
      System.out.print("=");
    }
    System.out.println("|");

    //

    // Draw the table underneath
    t.draw();
    // create width of the cake
    int cakewidth = layers * 4;
  }

  public int getWidth() {
    return this.width;
  }

  // methods for cake to end up centered
  public void draw() {

    System.out.println("width:" + this.width);
    System.out.println("layer:" + this.layers);
  }

  public void draw(int shiftRight) {
    System.out.println("before I draw, shift it:" + shiftRight);
    // this.draw();
    for (int s = 0; s < shiftRight; s++) {
      System.out.print("");
    }
  }
}
