
import java.util.Scanner;
public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Shkruani numrin decimal që doni të konvertoni në binar: ");
        int numriDecimal = scanner.nextInt();

        String numriBinar = konvertoNeBinar(numriDecimal);
        System.out.println("Numri " + numriDecimal + " në sistem binar është: " + numriBinar);
    }

    public static String konvertoNeBinar(int numri) {
        if (numri == 0) {
            return "0";
        }

        String rezultati = "";
        while (numri > 0) {
            int remainder = numri % 2;
            rezultati = remainder + rezultati;
            numri = numri / 2;
        }

        return rezultati;
    }
}
