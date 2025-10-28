package edu.bhscs;

public class Cake {

  private String type;
  private String frosting;
  private int layers;

  // Constructor
  public Cake(String type, String frosting, int layers) {
    this.type = type;
    this.frosting = frosting;
    this.layers = layers;
  }

  public Cake(int i, String string) {
    // TODO Auto-generated constructor stub
  }

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
  public void draw(String playerName, String playerAge) {
    System.out.println("\nCake for " + playerName + " (Age: " + playerAge + ")\n");

    // Draw stacked layers
    for (int i = 1; i <= layers; i++) {
      // Leading spaces for perspective
      for (int s = 0; s < layers + 5 * i; s++) {
        System.out.print(" ");
      }
      System.out.print("/");

      // Width grows with layer
      for (int j = 0; j < i * 4; j++) {
        System.out.print("#");
      }

      System.out.println("\\");
    }

    // Frosting line
    System.out.print("|");
    for (int j = 0; j < layers * 4; j++) {
      System.out.print("=");
    }
    System.out.println("|");

    // Cake info
    System.out.println("Type: " + type + " | Frosting: " + frosting);
  }

  public void draw(Table t) {
    System.out.println("Type: " + type + " | Frosting: " + frosting);
        // Draw a simple 3D-ish cake on the table
        System.out.println("\nYour cake is on the table!\n");

        // Cake layers
        for (int i = 1; i <= layers; i++) {
          for (int s = 0; s < layers - i; s++) System.out.print(" ");
          System.out.print("/");
          for (int j = 0; j < i * 4; j++) System.out.print("#");
          System.out.println("\\");
        }

        // Frosting line
        System.out.print("|");
        for (int j = 0; j < layers * 4; j++) System.out.print("=");
        System.out.println("|");

        // Cake info


    // Draw the table underneath
    t.draw();
    //
  }
}
