import java.util.Scanner;

public class LeftShift {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Showcasing LEFT SHIFT Operator");
        System.out.println("please enter the number:");
        int num = input.nextInt();

        int result = num << 4;
        System.out.println("the result is:" + result);
        input.close();

    }
    
}
