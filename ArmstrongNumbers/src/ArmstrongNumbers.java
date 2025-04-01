
import java.util.Scanner;
public class ArmstrongNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Shkruani një numër: ");
        int n = scanner.nextInt();
        int remainder;
        int numriFillestar;
        int shifra = 0;
        int sum = 0;

        numriFillestar = n;
        // Llogarit numrin e shifrave të numrit
        while (numriFillestar != 0) {
            numriFillestar /= 10;
            shifra++;
        }

        numriFillestar = n;

        // Llogarit fuqite dhe i mbledh
        while (numriFillestar != 0) {
            remainder = numriFillestar % 10;
            sum += Math.pow(remainder, shifra);
            numriFillestar /= 10;
        }

        if (n == sum) {
            System.out.println(n + " është një numër Armstrong.");
        } else {
            System.out.println(n + " nuk është një numër Armstrong.");
        }
    }
}
