package edu.bhscs;

public class Cake {
  private String type;
  private int slices;
  private double price;

  public Cake(String type, Flour f) {
    this.type = type;
    this.slices = 8;
    this.price = 20.0;
    System.out.println("Baking with " + f);
  }

  public String getType() {
    return type;
  }

  public int getSlices() {
    return slices;
  }

  public double getPrice() {
    return price;
  }

  @Override
  public String toString() {
    return type + " Cake | Slices: " + slices + " | Price: $" + price;
  }

  public void eatSlice() {
    if (slices > 0) {
      slices--;
      System.out.println("One slice eaten. Slices left: " + slices);
    }
  }

  public void changePrice(double newPrice) {
    if (newPrice >= 0) {
      price = newPrice;
      System.out.println("Cake price updated to $" + price);
    }
  }

  public void draw(String symbol, int repeatCount) {
    System.out.println("Drawing your " + type + " cake:");
    for (int i = 0; i < repeatCount; i++) {
      for (int j = 0; j < slices; j++) {
        System.out.print(symbol);
      }
      System.out.println();
    }
  }
}
