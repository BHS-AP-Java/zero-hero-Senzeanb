package edu.bhscs;

public class Cake {
  // fieds or properties
  String ingredient;

  // constructors
  public Cake() {
    this.ingredient = "chocolate";
  }

  // methods
  void draw(String icing, int l, int h, int w) {
    for (int count = 0; count < h; count++) {

      for (int i = 0; i < l + count; i++) {

        System.out.println(this.ingredient + this.ingredient);
        System.out.print("" + icing + icing);
        System.out.print(icing);
      }
      for (int j = l * l + h * h; j >= w; j--) {
        System.out.print(icing + ingredient + j);
      }
      System.out.println(("length:" + l) + "-!-" + ("width:" + w) + "-!-" + ("height:" + h));
      System.out.println("area of 2D cake" + (l * w * h));
    }
    System.out.println();

    System.out.println("--------!--!--!--!--!----");

    System.out.println("Drawing a cake...");
  }
}
