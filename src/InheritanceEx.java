/*
 Inheritance কি?
  -> Inheritance হলো এক class এর property বা method অন্য class এ reuse করার system.
  সোজা ভাষায়: Parent class এর সব কিছু Child class automatically পায়।
  Hafiz Vaiya (:
 */

// Super class
class Student {
    int roll;
    String name;

    // Constructor
    Student(int r, String n) {
        roll = r;
        name = n;
    }
    // Method to display basic student info
    void displayStudentInfo() {
        System.out.println("Roll: " + roll);
        System.out.println("Name: " + name);
    }
}
// Sub class (inherits Student)
class Result extends Student {
    float gpa;

    // Constructor for Result class
    Result(int r, String n, float g) {
        super(r, n);  // calling superclass constructor
        gpa = g;
    }

    // Method to display full result info
    void displayResult() {
        displayStudentInfo(); // call superclass method
        System.out.println("GPA: " + gpa);
    }
}
// Main class to run the program
public class InheritanceEx {
    public static void main(String[] args) {
        Result r1 = new Result(6087, "Hafiz", 3.92f);
        r1.displayResult();
    }
}
