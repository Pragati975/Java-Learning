import java.util.Scanner;

class Check {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to check if a number is postive,negative,or zero");
        System.out.println("enter the number:");
        int num = input.nextInt();
         
        if(num>0) {
            System.out.println("the number is positive");
        }
            else
             if(num == 0) {
                System.out.println("the number is zero");
             }
                else {
                    System.out.println("the number is negative");
                }
            }
        }
    
    

