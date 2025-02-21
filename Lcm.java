import java.util.Scanner;

public class Lcm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.err.println("welcome to calculate lcm of two numbers");
        System.out.println("please enter your number:");
        int first = input.nextInt();
        System.out.println("please enter your number:");
        int second = input.nextInt();
        int lcm = lcm(first,second);
        System.out.println("lcm is:" + lcm);


    }
    public static int lcm(int first,int second) {
        int i = 1;
        while(true) {
            int factor = first*i;
            if(factor % second ==0) {
                return factor;
            }
            i++;
        }
    }
    
}
