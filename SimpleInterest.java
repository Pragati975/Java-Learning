import java.util.Scanner;

class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to calculate simple interest");
        System.out.println("enter principle value:");
        double P = input.nextDouble();
        System.out.println("enter time period:");
        double T = input.nextDouble();
        System.out.println("enter rate of interest:");
        double R = input.nextDouble();

        double simpleinterest = (P*T*R)/100;
        System.out.println("simple interest is:" + simpleinterest);
        input.close();
    }
    
}
