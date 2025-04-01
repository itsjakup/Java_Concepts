
import java.util.Scanner;
public class PalindromeString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String string = scanner.nextLine();
        PalindromeString palindromeString = new PalindromeString();

        if (palindromeString.isPalindrome(string)){
            System.out.println("Palindrome :)");
        } else {
            System.out.println("Not Palindrome :(");
        }
    }

    public boolean isPalindrome(String original) {
        int i = original.length() - 1;
        int j = 0;
        while (i > j) {
            if (original.charAt(i) != original.charAt(j)) {
                return false;
            }
            i--;
            j++;
        }
        return true;
    }
}