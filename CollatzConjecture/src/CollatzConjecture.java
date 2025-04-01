
import java.util.Scanner;
public class CollatzConjecture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer to start Collatz sequence: ");
        int number = scanner.nextInt();
        System.out.println("Collatz sequence for " + number + ":");
        while (number != 1) {
            System.out.print(number + " -> ");
            if (number % 2 == 0) {
                number = number / 2;
            } else {
                number = 3 * number + 1;
            }
        }
        System.out.println(number);
        // Printing the last number 1 in the sequence.
    }
}
