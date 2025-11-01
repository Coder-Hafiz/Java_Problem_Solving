import java.util.Scanner;

public class largestnumfind {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Your 1st Number: ");
        int a = input.nextInt();

        System.out.println("Enter Your 2nd Number: ");
        int b = input.nextInt();

        System.out.println("Enter Your 3rd Number: ");
        int c = input.nextInt();

        if (a>b && a>c){
            System.out.println("The Largest Number Is: "+a);
        }

        else if (b>a && b>c){
            System.out.println("The Largest Number Is: "+b);
        }

        else {
            System.out.println("The Largest Number Is: "+c);
        }
    }
}
