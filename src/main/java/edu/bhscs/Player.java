package edu.bhscs;

import java.util.Scanner;

public class Player {
  private Scanner sc;

  public Player() {
    sc = new Scanner(System.in);
  }

  public String giveAnswer(String prompt) {
    System.out.print(prompt + " ");
    return sc.nextLine();
  }

  public int getInt(String prompt) {
    System.out.print(prompt + " ");
    while (!sc.hasNextInt()) {
      System.out.println("Please enter a number.");
      sc.next(); // discard invalid input
    }
    int result = sc.nextInt();
    sc.nextLine(); // consume newline
    return result;
  }

  public boolean getYesNo(String prompt) {
    System.out.print(prompt + " (y/n) ");
    String response = sc.nextLine();
    return response.equalsIgnoreCase("y");
  }
}
