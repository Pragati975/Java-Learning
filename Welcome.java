import java.util.Scanner;

class Welcome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your name:");
        String name = input.nextLine();
        
        System.out.println("welcome " + name + " to kg coding");
        input.close();
        

    }
    
}
