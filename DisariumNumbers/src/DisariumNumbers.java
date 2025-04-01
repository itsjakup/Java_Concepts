
import java.util.Scanner;
public class DisariumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        int numriFillestar = n;
        int shifra = 0;

        // Gjej numrin e shifrave në numër
        while (numriFillestar != 0) {
            numriFillestar = numriFillestar / 10;
            shifra++;
        }
        numriFillestar = n;
        // rinis numrin fillestar pasi ai është ndryshuar në loop-in e mëparshëm
        int sum = 0;
        while (numriFillestar > 0) {
            int remainder = numriFillestar % 10;
            sum += Math.pow(remainder, shifra);
            numriFillestar = numriFillestar / 10;
            shifra--;
        }

        if (n == sum) {
            System.out.println("Numri eshte disarium.");
        } else {
            System.out.println("Numri nuk eshte disarium.");
        }
    }
}