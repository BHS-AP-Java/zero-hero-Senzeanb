package edu.bhscs;

public class Cake {
    private String flavor;
    private String[] ingredients;
    private String shape;
    private String state; // e.g., "fresh", "moldy", "decomposed"

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
        this.shape = "pentagon";
        this.state = "fresh";
        System.out.println("bake the cake... flavor: " + this.flavor + ", shape: " + this.shape);
    }

    // Custom cake constructor
    public Cake(String flavor, String[] ingredients) {
        this.flavor = flavor;
        this.ingredients = ingredients;
        this.shape = "pentagon";
        this.state = "fresh";
        System.out.println("bake the cake... flavor: " + this.flavor + ", shape: " + this.shape);
    }

    public String getFlavor() {
        return flavor;
    }

    public String[] getIngredients() {
        return ingredients;
    }

    public String getShape() {
        return shape;
    }

    public String getState() {
        return state;
    }

    // Simulate cake going moldy after days
    public void growMold() {
        if (state.equals("fresh")) {
            state = "moldy";
            System.out.println("The " + flavor + " cake has grown green mold!");
        }
    }

    // Simulate cake decomposing
    public void decompose() {
        if (state.equals("moldy")) {
            state = "decomposed";
            System.out.println("The " + flavor + " cake has decomposed and is thrown away.");
        }
    }
}
