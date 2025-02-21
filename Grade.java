import java.util.Scanner;


class Grade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to check grade based on marks");
        System.out.println("enter the marks:");
        int marks = input.nextInt();

        if (marks > 90  ) {
            System.out.println("GRADE A secured");
        }
        else if (marks >75 && marks< 90) {
            System.out.println("GRADE B secured");
        }
        else if (marks > 60 && marks < 75) {
            System.out.println("GRADE C secured");
        }
        else if (marks > 30 && marks< 60) {
            System.out.println("GRADE D secured");
        }
        else{
            System.out.println("GRADE F secured");
        }
        input.close();
    }
    
}
