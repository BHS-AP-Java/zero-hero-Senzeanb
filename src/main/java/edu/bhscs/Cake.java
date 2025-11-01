package edu.bhscs;

public class Cake {

  public static int width;
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
  public void draw(String playerName, String playerAge, int offset) {
    for(int i = 0; i < offset; i++){
      System.out.print( i );
    }
    System.out.print( offset );
    System.out.println(" Cake for " + playerName + " (Age: " + playerAge + ")\n");
    // Draw candles

    /*
    for (int c = 0; c < layers; c++) {
      System.out.print("* ");
      System.out.print("||");
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
    */
  }

  public void draw(Table t) {
    System.out.println("Type: " + type + " | Frosting: " + frosting);
    // Draw a simple 3D-ish cake on the table
    System.out.println("\nYour cake is on the table!\n");

    System.out.println("???????????????????????????????????????????");

    // Here is where I actually need to do the tricky math!
    int offset      = (this.getWidth() - t.getWidth())/2;
    int cakeOffset  = 0;
    int tableOffset = 0;

    if(offset > 0){
      cakeOffset    = 0;
      tableOffset   = offset;
    }
    else{
      cakeOffset    = Math.abs(tableOffset);
      tableOffset   = 0;
    }


    // Well.... I need to draw the cake first.... cause it is on top.
    this.draw("Sen the great", "17" , cakeOffset);

    System.out.println("???????????????????????????????????????????");

    // then I will need to draw the table
    t.draw(tableOffset);



    // the tricky bit... I will want the table or the cake to be offset some amount... which is hard.
























/*

    // Cake layers
    for (int i = 1; i <= layers; i++) {
      for (int s = 0; s < layers - i; s++) System.out.print(" ");
      System.out.print("/");
      for (int j = 0; j < i * 4; j++) System.out.print("#");
      System.out.println("\\");
    }

    // of cake line
    System.out.print("|");
    for (int j = 0; j < layers * 4; j++) System.out.print("=");
    System.out.println("|");

    //

    // Draw the table underneath
    t.draw();
    // create width of the cake
    int cakeWidth = layers * 4;*/
  }

  public int getWidth() {
    return this.width;
  }

  //methods for cake to end up centered

}
