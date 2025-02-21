import java.util.Scanner;

class Perimeter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to calculate perimeter of a rectangle");
        System.out.println("enter all 4 sides of the rectangle in cm:");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();

        double perimeter = a+b+c+d;
        System.out.println("the perimeter of the rectangle is:" + perimeter + "cm");
        input.close();


    }
    
}
