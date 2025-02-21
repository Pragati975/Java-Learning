import java.util.Scanner;

class AgeGroup {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to categorize a person into different age groups");
        System.out.println("enter the age of a person:");
        int age = input.nextInt();

        if(age < 13) {
            System.out.println("child");
        }
        else if (age < 20 && age >13) {
            System.out.println("teen");
        }
        else if (age < 60 && age > 20) {
            System.out.println("adult");
        }
        else {
            System.out.println("senior");
        }
        input.close();
        
    }
    
}
