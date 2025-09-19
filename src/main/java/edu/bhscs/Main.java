// sen bajgai
// P2
// Zero-Hero
// 09/19/2025

/*
 * DESCRIPTION: Whatever Mr Reiber says
 * INPUT: We don't know about input yet
 * OUTPUT: Some cool works in the command line terminal thing
 * EDGE CASE: They are all edge cases at the moment
 */

package edu.bhscs;

public class Main {
  public static void main(String[] arges) {
    // Main story points
    Person mrReiber = new Person("Mr.Reiber", 60.0);
    String[] apcsStudents = {"Sen", "Steve", "Sue", "Linda", "Jhon"};
    Subject apCompSciA = new Subject("AP Computer Science A", apcsStudents);

    // Mr.Reiber buys a cake for his students
    System.out.println(mrReiber.getName() + " shares a cake with his students from " + apCompSciA.getName() + ":");
    for (String student : apCompSciA.getStudents()) {
      System.out.println("  " + student + " gets a piece of cake!");
    }
    mrReiber.buyCake(60.0);

    // Introduce new flavor: Blueberry cheesecake
    Cake blueberryCake = new Cake("Blueberry cheesecake", new String[] {
      "flour", "blueberry extract", "cream cheese", "butter", "6 eggs", "1 cup of whole milk", "1/4 cup butter", "1 cup condensed milk"
    });
    System.out.println("Cake flavor: " + blueberryCake.getFlavor() + " is a hit and everyone loves it!");

    // Robbery event
    System.out.println("A robber comes into the bakery and tries to steal the cake!");
    System.out.println("Mr.Reiber steps in and stops the robbery!");
    mrReiber = new Person("Mr.Reiber", 60.0, "Security Guard", 30.0);
    System.out.println("Mr.Reiber is now hired as " + mrReiber.getJobTitle() + " and paid $" + mrReiber.getHourlyWage() + " per hour.");

    // Cake shop hires staff
    Person sen = new Person("Sen", 0.0, "Store Manager", 25.0);
    Person steveStaff = new Person("Steve", 0.0, "Cleaner", 18.0);
    Person linda = new Person("Linda", 0.0, "Baker", 22.0);
    Person jhon = new Person("Jhon", 0.0, "Cashier", 20.0);
    System.out.println("Cake shop hires staff:");
    System.out.println(sen.getName() + " is hired as " + sen.getJobTitle() + " and paid $" + sen.getHourlyWage() + " per hour.");
    System.out.println(steveStaff.getName() + " is hired as " + steveStaff.getJobTitle() + " and paid $" + steveStaff.getHourlyWage() + " per hour.");
    System.out.println(linda.getName() + " is hired as " + linda.getJobTitle() + " and paid $" + linda.getHourlyWage() + " per hour.");
    System.out.println(jhon.getName() + " is hired as " + jhon.getJobTitle() + " and paid $" + jhon.getHourlyWage() + " per hour.");

    // Jhon comes back for more cake
    System.out.println("Jhon comes back to " + mrReiber.getName() + " and takes 1 slice of vanilla cake and 1 slice of strawberry cake!");
  }
}
