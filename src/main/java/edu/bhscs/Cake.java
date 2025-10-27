package edu.bhscs;

public class Cake {
  private String type;
  private char symbol;
  private int layers;

  public Cake(String type, char symbol, int layers) {
    this.type = type;
    this.symbol = symbol;
    this.layers = layers;
  }

  // Getter for Customer
  public String getType() {
    return type;
  }

  // Draw method using nested loops
  public void draw() {
    System.out.println("Here's your cake: " + type);

    // Top decoration
    for (int i = 0; i < layers; i++) {
      for (int j = 0; j < layers - i; j++) {
        System.out.print(" ");
      }
      for (int k = 0; k < i * 2 + 1; k++) {
        System.out.print("*");
      }
      System.out.println();
    }

    // Body of the cake
    for (int i = 0; i < layers; i++) {
      System.out.print("|");
      for (int j = 0; j < layers * 2; j++) {
        System.out.print(symbol);
      }
      System.out.println("|");
    }

    // Base
    for (int i = 0; i < layers * 2 + 2; i++) {
      System.out.print("-");
    }
    System.out.println();
  }
}
