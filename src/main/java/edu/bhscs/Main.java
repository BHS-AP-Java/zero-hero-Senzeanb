package edu.bhscs;

public class Main {
  
  public static void main(String[] args) {
    Player user = new Player(); // no string argument

    String name = user.giveAnswer("What is your name?");
    String age = user.giveAnswer("How old are you?");
    String type = user.giveAnswer("What type of cake?");
    String frosting = user.giveAnswer("What frosting do you want?");
    int layers = user.getInt("How many layers should the cake have?");

    Cake myCake = new Cake(type, frosting, layers);

    myCake.draw(name, age);
  }
}
