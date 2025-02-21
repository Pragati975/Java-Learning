import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to fibonacci series");
        System.out.println("please enter the number upto which the series has to be printed");
        int num = input.nextInt();
        System.out.println("here is the fibonacci series");
        printFibonacci(num);

    }
    public static void printFibonacci(int num) {
        if (num<0) return;
        System.out.println("0 ");
        if (num ==0) return;
        System.out.println("1 ");

        int first = 0, second = 1;
        while(first + second <= num) {
            int third = first + second;
            System.out.print(third + " ");
            first = second;
            second = third;
        }

        
    }
    
}
