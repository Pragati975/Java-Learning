import java.util.Scanner;

public class And {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Showcasing Bitwise And Operator\n");
        System.out.println("please enter the first number:");
        int first = input.nextInt();
        System.out.println("now enter the second number:");
        int second = input.nextInt();

        int result = first & second;
        System.out.println("the result is:" + result);
        input.close();
    }
    
}
