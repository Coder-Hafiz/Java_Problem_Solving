/*
ধরো তোমার কলেজে রুলবুক আছে
  ১।কখন ক্লাস হবে।
  ২।কীভাবে আইডি কার্ড রাখতে হবে।
  ৩।আচরণ কেমন হবে।
এই রুলবুকটা Interface.
মানে শুধু নিয়ম বলা আছে, কিন্তু কাজ কিভাবে করবে সেটা লেখা নাই।

এখন তুমি ছাত্র (Student class)
তোমাকে রুলবুকের নিয়ম follow করে কাজ করতে হবে।

তুমি কলেজে ঢোকার সাথে সাথেই:
  ১।আইডি কার্ড গলায় 
  ২।ইউনিফর্ম পরা 
  ৩।ক্লাসে টাইমমতো 
এইগুলো Constructor দিয়া তোমার data initialize হইছে basically
Hafiz Vaiya (:
 */

// রুলবুক (Interface)
interface CollegeRules {
    void attendClass();
    void wearIDCard();
}
// ছাত্র (Class)
class Student implements CollegeRules {
    String name;
    int roll;

    // ভর্তি হওয়ার সময় identity সেট করে দেয়া (Constructor)
    Student(String n, int r) {
        name = n;
        roll = r;
    }
    public void attendClass() {
        System.out.println(name + " Present in Class");
    }

    public void wearIDCard() {
        System.out.println(name + " were id card");
    }
}
public class InterfaceEx {
    public static void main(String[] args) {
        Student s1 = new Student("java", 101);
        s1.attendClass();
        s1.wearIDCard();
    }
}
