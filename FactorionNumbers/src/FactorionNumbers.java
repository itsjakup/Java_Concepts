
import java.util.Scanner;
public class FactorionNumbers {
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static boolean isFactorion(int num) {
        int sum = 0;
        int originalNum = num;

        while (num != 0) {
            int digit = num % 10;
            sum += factorial(digit);
            num /= 10;
        }

        return sum == originalNum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = scanner.nextInt();

        if (isFactorion(n)) {
            System.out.println(n + " is a factorion number.");
        } else {
            System.out.println(n + " is not a factorion number.");
        }
    }
}