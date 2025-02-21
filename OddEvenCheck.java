import java.util.Scanner;

class OddEvenCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to check if the number is odd or even");
        System.out.println("enter the number:");
        int num = input.nextInt();

        if(num%2==0) {
            System.out.println("the number is even");
        }
        else {
            System.out.println("the number is odd");
        }
        input.close();

    }

    
}
