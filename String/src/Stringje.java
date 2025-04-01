import java.util.Locale;
import java.util.Scanner;

public class Stringje {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String string = scanner.next();

        //afishimi i stringut fillestar dhe atij te reversuar;
        String reverse = new StringBuffer(string).reverse().toString();
        System.out.println(reverse);
    }
}
