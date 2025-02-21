import java.util.Scanner;

public class PalindromeRecursion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to palindrome checker");
        System.out.println("enter the string to be checked:");
        String str = input.next();
        System.out.println("Your string is" + ((isPalindrome(str) ? "palindrome" : "Not palindrme")));
    }
    public static boolean isPalindrome(String str) {
        if (str.length() <= 1) {
            return true;
        }
        int lastpos = str.length() - 1;
        if (str.charAt(0) != str.charAt(lastpos)) {
            return false;
        }
        String newStr = str.substring(1,lastpos);
        return isPalindrome(newStr);
    }
    
}
