
import java.util.Scanner;
public class Consonants {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Shkruani një string: ");
        String input = scanner.nextLine();

        int consonantCount = 0;
        System.out.print("Bashketingelloret jane: ");
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.toLowerCase().charAt(i);
            if (currentChar >= 'a' && currentChar <= 'z' && currentChar !=
                    'a' && currentChar != 'e' && currentChar != 'i' && currentChar !=
                    'o' && currentChar != 'u') {
                consonantCount++;
                System.out.print(currentChar + " ");
            }
        }

        System.out.println("\nNumri i bashkëtingëlloreve në string është: " + consonantCount);
    }
}
