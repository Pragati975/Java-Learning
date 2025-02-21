import java.util.Scanner;

class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to calculate area of triangle");
        System.out.println("enter breadth of the triangle:");
        double B = input.nextDouble();
        System.out.println("enter height of the triangle:");
        double H = input.nextDouble();

        double area =(B*H)/2;
        System.out.println("area of the triangle is:" + area);
        input.close();
    }
}