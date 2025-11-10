/*
 Fibonacci কি?
  =>Fibonacci sequence = একটা সিরিজ যেখানে প্রতিটা সংখ্যা = তার আগের দুইটার যোগফল।
    প্রথম দুইটা সংখ্যা সাধারণত 0, 1 (কিছু ক্ষেত্রে 1, 1)
    Hafiz Vaiya :
 */

public class FibonacciExample {
    public static void main(String[] args) {

        int n = 20; // কতগুলো number generate করতে চাই
        int t1 = 0, t2 = 1;

        System.out.println("Fibonacci Series up to 20 terms:");

        for (int i = 1; i <= n; i++) {
            System.out.print(t1 + " ");

            int nextTerm = t1 + t2;
            t1 = t2;
            t2 = nextTerm;
        }
    }
}

/*
 t1 = প্রথম সংখ্যা (0), t2 = দ্বিতীয় সংখ্যা (1)
 Loop চালিয়ে nextTerm = t1 + t2 বের করা...
 তারপর t1 = t2, t2 = nextTerm update করা। // swaping
 */