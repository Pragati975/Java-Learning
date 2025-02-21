import java.util.Scanner;

public class Compliment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Showcasing Bitwise Compliment Operator");
        System.out.println("please enter a number:");
        int num = input.nextInt();

        int result = ~num;
        System.out.println("the result is:" + result);
        input.close();
    }

    
}
