import java.util.Scanner;

public class OddEvenBitwise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter a number:");
        int num = input.nextInt();

        if ((num & 1) == 1) {
            System.out.println("the number is odd");

        }
        else {
            System.out.println("the number is even");
        }
        input.close();
    }
    
}
