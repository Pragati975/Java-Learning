import java.util.Scanner;

class ArithmeticOperators {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to Arithmetic Operators");
        System.out.println("enter first number:");
        int a = input.nextInt();
        System.out.println("enter the second number:");
        int b = input.nextInt();

        int sum = a+b;
        int subtraction = a-b;
        int multiplication = a*b;
        int division = a/b;
        int modulus = a%b;

        System.out.println("the addition is:" + sum + "\nthe subtraction is:" + subtraction + "\nthe multiplication is:" + multiplication + "\nthe division is:" + division + "\nthe modulus is:" + modulus);
        input.close();
    }
    
}
