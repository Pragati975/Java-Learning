import java.util.Scanner;

public class PasswordChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to set your password\n");
        String password;
        do {
            System.out.println("please enter your password\n");
            password = input.next();
        } while (!isValidPassword(password));
        System.out.println("thanks for entering a valid password");
    }
    public static boolean isValidPassword(String password) {
        return password.length() > 6;
    }
    
}
