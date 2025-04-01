
import java.util.Scanner;
public class Numbers {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a binary number: ");
        int n = scanner.nextInt();
        int decimal = 0;
        int power = 0;

        // Conversion into decimal
        while (n > 0) {
            int remainder = n % 10;
            decimal += remainder * Math.pow(2, power);
            n /= 10; // Move to the next digit of the binary number
            power++;
        }

        System.out.println("Decimal: " + decimal);
    }
}
