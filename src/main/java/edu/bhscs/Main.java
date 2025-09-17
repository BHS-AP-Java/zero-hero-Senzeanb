// sen bajgai
// P02
// Zero-Hero
// 09/17/2025

/*
 * DESCRIPTION: Whatever Mr Reiber says
 * INPUT: We don't know about input yet
 * OUTPUT: Some cool works in the command line terminal thing
 * EDGE CASE: They are all edge cases at the moment
 */

package edu.bhscs;

class Main {

  public static void main(String[] arges) {
    Person p = new Person("Sen", 17);
    Subject p2 = new Subject("ApCompSciA");
    System.out.println("Subject name: " + p2.getName());
    System.out.println(p.getName());
    System.out.println(p.getName());
    System.out.println(p.getName());
    System.out.println(p.getAge());
    System.out.println(p.getAge());
    System.out.println(p.getAge());
    System.out.println(p.getAge() + p.getName());
    System.out.println(p.getName() + p.getAge());
    System.out.println(p2.getSubject());
    System.out.println(p2.getSubject());
    System.out.println(p2.getSubject());
    System.out.println(p.getName() + p.getAge() + p2.getSubject());
    System.out.println(p.getName() + p.getAge() + p2.getSubject());
  }

  /**
   * Builds a right-angled staircase string of given height using stepChar.
   * Each line i contains i stepChars, ending with a newline.
   * Returns empty string for height 0.
   * Throws IllegalArgumentException for negative height.
   */
  public static String drawIt(int height, char stepChar) {
    if (height < 0) {
      throw new IllegalArgumentException("Height must be non-negative");
    }
    StringBuilder sb = new StringBuilder();
    for (int i = 1; i <= height; i++) {
      for (int j = 0; j < i; j++) {
        sb.append(stepChar);
      }
      sb.append('\n');
    }
    return sb.toString();
  }

  public static class Subject {
    private String name;

    public Subject(String name) {
      this.name = name;
    }

    public String getName() {
      return name;
    }

    public String getSubject() {
      return name;
    }
  }

  public static class Person {
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
      this.name = name;
      this.age = age;
    }

    // Getter methods
    public String getName() {
      return name;
    }

    public int getAge() {
      return age;
    }
  }
}
