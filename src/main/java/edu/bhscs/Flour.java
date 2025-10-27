package edu.bhscs;

public class Flour {
  private String type;

  public Flour() {
    this.type = "All-Purpose";
  }

  @Override
  public String toString() {
    return type + " flour";
  }
}
