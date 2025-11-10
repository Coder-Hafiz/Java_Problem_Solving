/*
Method কি?
  Method হলো একটা কাজ করার জন্য লেখা কোডের block।
  মানে তুমি কোনো কাজ বারবার করতে চাও, তুমি সেই কাজ method হিসেবে লিখবে, 
  তারপর দরকার হলে শুধু call করবে।

  Hafiz Vaiya (:
 */

class Student {
    String name;
    int roll;
    String dept;

    // method: student info set করা
    void setInfo(String n, int r, String d) {
        name = n;
        roll = r;
        dept = d;
    }
    // method: student info দেখানো
    void showInfo() {
        System.out.println("Name: " + name);
        System.out.println("Roll: " + roll);
        System.out.println("Department: " + dept);
    }
}
public class MethodEx {
    public static void main(String[] args) {

        Student s1 = new Student();

        // method দিয়ে value দেয়া হলো
        s1.setInfo("Hafiz", 101, "CST");;

        // method দিয়ে তথ্য দেখানো হলো
        System.out.println("----- Student 1 -----");
        s1.showInfo();
    }
}
