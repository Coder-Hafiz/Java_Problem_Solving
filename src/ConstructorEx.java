/*
 Constructor হলো একটা special method, 
 যেটা class থেকে object তৈরি হওয়ার সময় নিজে নিজেই auto-run হয়, 
 এবং object এর variable গুলাতে initial value বসাতে ব্যবহার করা হয়

i.নাম class এর নামের সাথে same থাকে কারণ constructor class এর সাথে জুড়ে থাকে।
ii.কোনো return type থাকে নাই void ও না ।
iii.Object তৈরি হলে auto call হয় manual call করার দরকার হয়না। 

Hafiz Vaiya (:
 */
 class Student {
    String name;
    int age;
    Student(String n, int a) {
        name = n;
        age = a;   // object তৈরি হবার সাথে সাথে value বসে যাবে.
    }
    void showInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
public class ConstructorEx {
    public static void main(String[] args) {
        Student s1 = new Student("Rakib", 20);
        Student s2 = new Student("Mahim", 19);

        s1.showInfo();
        System.out.println();
        s2.showInfo();
    }
}
