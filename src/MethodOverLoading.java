/*
 Method Overloading কাকে বলে?
  একই class এর ভিতরে একই নামের একাধিক method থাকবে,
  কিন্তু তাদের parameter আলাদা হবে (প্যারামিটার সংখ্যা বা টাইপ ভিন্ন)।

ধরো তুমি কাউকে ডাকো "Bro"
  Bro ছোট হলে → তুমি হাত রাখবা মাথায়।
  Bro সমবয়সী হলে → normal vibe.
  Bro senior হলে → respect + সালাম।

ডাকার নাম same, reaction different. এটাই method overloading.
 */
 class Student {
    // method 1: শুধু নাম নেয়
    void info(String name) {
        System.out.println("Name: " + name);
    }
    // method 2: নাম + রোল নেয়
    void info(String name, int roll) {
        System.out.println("Name: " + name);
        System.out.println("Roll: " + roll);
    }
    // method 3: নাম + রোল + ডিপার্টমেন্ট নেয়
    void info(String name, int roll, String dept) {
        System.out.println("Name: " + name);
        System.out.println("Roll: " + roll);
        System.out.println("Department: " + dept);
    }
}
public class MethodOverLoading {
    public static void main(String[] args) {
        Student s = new Student();

        s.info("Hafiz");
        System.out.println();

        s.info("Hafiz", 101);
        System.out.println();

        s.info("Hafiz", 101, "CST");
    }
}
