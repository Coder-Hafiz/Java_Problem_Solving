/*
 Array কি?
  => Array হলো একই ধরনের data গুলোকে একসাথে রাখার একটা structure।
     মানে: অনেকগুলো variable একসাথে single name এর নিচে store করা যায়।
     Hafiz Vaiya (:
 */
public class ArrayExample {
    public static void main(String[] args) {
        int[] marks = {85, 90, 78, 92, 88};
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Student " + (i+1) + ": " + marks[i]);
        }
    }
}
