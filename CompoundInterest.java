import java.util.Scanner;

class CompoundInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to calculate compound interest");
        System.out.println("Enter PRINCIPLE VALUE:");
        double P = input.nextDouble();
        System.out.println("Enter TIME PERIOD:");
        double T = input.nextDouble();
        System.out.println("Enter RATE OF INTEREST:");
        double R = input.nextDouble();

        double compoundinterest = P*((1+R)/100)*T;
        System.out.println("the compound interest is:" + compoundinterest);
        input.close();
    }
    
}
