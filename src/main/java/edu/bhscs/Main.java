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
        System.out.println(p.getName());
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