import java.util.Scanner;

class Swap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to swapping of two numbers");
        System.out.println("enter the first number:");
        int a = input.nextInt();
        System.out.println("enter the second number:");
        int b = input.nextInt();

        
        int c=a;
        a=b;
        b=c;

        
        System.out.println("after swapping: a = " + a + " ,b = " + b);
        input.close();
    }
    
}
