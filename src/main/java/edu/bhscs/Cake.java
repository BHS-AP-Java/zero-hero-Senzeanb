package edu.bhscs;

public class Cake {

  private String flavor;
  private String[] ingredients;

  // Vanilla cake constructor
  public Cake() {
    this.flavor = "vanilla";
    this.ingredients = new String[] {
      "flour",
      "vanilla extract",
      "white chocolate",
      "butter",
      "6 eggs",
      "1 cup of whole milk",
      "1/4 cup butter",
      "1 cup condensed milk"
    };
    System.out.println("bake the cake... flavor: " + this.flavor);
  }

  // Custom cake constructor
  public Cake(String flavor, String[] ingredients) {
    this.flavor = flavor;
    this.ingredients = ingredients;
    System.out.println("bake the cake... flavor: " + this.flavor);
  }


  public String getFlavor() {
    return flavor;
  }

  public String[] getIngredients() {
    return ingredients;
  }

}
