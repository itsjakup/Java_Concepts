
import java.util.Scanner;
public class Vowels {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a string: ");
        String string = scanner.next();

        int count = 0;
        string = string.toLowerCase();

        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }

System.out.println("number of vowls is " + count);
       // return count;
    }
}
