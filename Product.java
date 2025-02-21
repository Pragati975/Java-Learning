import java.util.Scanner;

class Product {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to calculate product of two floating point numbers");
        System.out.println("enter the first number:");
        float a = input.nextFloat();
        System.out.println("enter the second number:");
        float b = input.nextFloat();

        float product = a*b;
        System.out.println("the product is:" + product);
        input.close();
    }
    
}
