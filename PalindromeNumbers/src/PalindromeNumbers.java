import java.util.Scanner;

public class PalindromeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
System.out.println("enter a number: ");
        int number = scanner.nextInt();
        boolean itsPalindrome = itsPalindrome(number);
        System.out.println("check whether is palindrome: " + itsPalindrome);
        scanner.close();
    }

    public static boolean itsPalindrome(int number) {
        int reverse = 0;
        int original_number = number;

        while (number != 0) {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number /= 10;
        }

        return original_number == reverse;
    }
}