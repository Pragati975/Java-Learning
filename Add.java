import java.util.Scanner;

class Add {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to addition of two numbers");
        System.out.println("Enter the first number:");
        int first = input.nextInt();
        System.out.println("Enter the second number");
        int second = input.nextInt();

        int sum = first + second;
        System.out.println("the sum is:" + sum);
        input.close();

    }
    
}
