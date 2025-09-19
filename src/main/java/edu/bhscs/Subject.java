package edu.bhscs;

public class Subject {
    private String name;
    private String[] students;

    public Subject(String name, String[] students) {
        this.name = name;
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public String[] getStudents() {
        return students;
    }
}
