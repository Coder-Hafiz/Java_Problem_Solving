//ax2+bx+c=0
//Discriminant (D) = b² - 4ac

/* 
যদি D > 0 → দুইটা real & আলাদা root
যদি D == 0 → দুইটা real & equal root
যদি D < 0 → root imaginary হবে 

Hafiz Vaiya (:
*/
import java.util.Scanner;
public class QuadraticRoots {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter 1st Num: ");
        double a = input.nextDouble();

        System.out.print("Enter 2nd Num: ");
        double b = input.nextDouble();

        System.out.print("Enter 3rd Num: ");
        double c = input.nextDouble();

        double D = b * b - 4 * a * c;

        if (D > 0) {
            double root1 = (-b + Math.sqrt(D)) / (2 * a);
            double root2 = (-b - Math.sqrt(D)) / (2 * a);
            System.out.println("দুইটা Real ও আলাদা root:");
            System.out.println("Root 1 = " + root1);
            System.out.println("Root 2 = " + root2);
        } else if (D == 0) {
            double root = -b / (2 * a);
            System.out.println("দুইটা Real কিন্তু সমান root:");
            System.out.println("Root = " + root);

        } else {
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-D) / (2 * a);
            System.out.println("Root imaginary ভাই:");
            System.out.println("Root 1 = " + realPart + " + " + imaginaryPart + "i");
            System.out.println("Root 2 = " + realPart + " - " + imaginaryPart + "i");
        }

        input.close();
    }
}
