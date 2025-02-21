import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to armstrong number");
        System.out.println("please enter your number:");
        int num = input.nextInt();
        boolean isArmstrong = isArmstrong(num);
        if(isArmstrong) {
            System.out.println("your number is armstrong");
        }
        else {
            System.out.println("your number is not armstrong");
        }
    }
    public static boolean isArmstrong(int num) {
        int noOfDigits = noOfDigits(num);
        int numCopy = num;
        int finalNumber = 0;
        while (num > 0) {
            int lastDigit = num % 10;
            num /= 10;
            finalNumber += pow(lastDigit, noOfDigits);
        }
        return finalNumber == numCopy;
    }

    public static int pow(int num1, int num2) {
        int result = 1;
        int i = 0;
        while (i < num2) {
            result *= num1;
            i++;
        }
        return result;
    }

    public static int noOfDigits(int num) {
        int digits = 0;
        while (num > 0) {
            digits++;
            num /= 10;
        }
        return digits;
    }
}
    
    

