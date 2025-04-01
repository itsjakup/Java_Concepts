
import java.util.Scanner;
public class HarshadNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        int originalNumber = number;
        int sum = 0, reminder;

        while (number != 0) {
            reminder = number % 10;
            sum += reminder;
            System.out.print("Digits are " + reminder);
            number /= 10;
        }

        if (originalNumber % sum == 0) {
            System.out.println("\n" + originalNumber + " is a Harshad number.");
        } else {
            System.out.println(originalNumber + " is not a Harshad number.");
        }
    }

}
