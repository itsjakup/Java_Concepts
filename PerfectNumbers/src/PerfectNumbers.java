
import java.util.Scanner;
public class PerfectNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        if (sum == number) {
            System.out.println("Number is perfect: " + number);
        } else {
            System.out.println("Number is not perfect");
        }

        scanner.close();
    }
}