import java.util.Scanner;

class Leapyear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to check Leap year");
        System.out.println("enter a year:");890
        
        int year = input.nextInt();

        if(year%4==0 && year%100!=0 || year%400==0) {
            System.out.println("the year is leap year");
        }
        else {
            System.out.println("the year is not leap year");
        }
        input.close();
        
    }
    
}
