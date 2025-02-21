import java.util.Scanner;

public class RightShift {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Showcasing RIGHT SHIFT Operator");
        System.out.println("please enter a number:");
        int num = input.nextInt();

        int result = num>>1;
        System.out.println("the result is:" + result);
        input.close();
    }
    
    
}
