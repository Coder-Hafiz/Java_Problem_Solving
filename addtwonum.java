import java.util.Scanner;

public class addtwonum {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Please Enter Your 1st Number: ");
    int num1 = input.nextInt();
    System.out.println("Please Enter Your 2nd Number: ");
    int num2 = input.nextInt();

    int sum = num1+num2;
    System.out.println("Your Summation Is: "+sum);
}
}
