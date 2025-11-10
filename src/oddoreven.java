//Hafiz Vaiya
import java.util.Scanner;

public class oddoreven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter A Int Number: ");
        int N = input.nextInt();

        if (N % 2 == 0){
            System.out.println("You Entered Even Number: "+N);
        }
        else{
            System.out.println("You Entered a Odd Number: "+N);
        }
    }
}
