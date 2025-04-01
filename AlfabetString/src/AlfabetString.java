
import java.util.*;
public class AlfabetString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Futni stringet (të ndara me presje):");
        String input = scanner.nextLine();
        String[] stringet = input.split(",\\s*");

        // Renditja e stringeve sipas alfabetit
        Arrays.sort(stringet);

        // Afisho stringet sipas alfabetit
        System.out.print("Stringet sipas alfabetit: ");
        for (String str : stringet) {
            System.out.print(str + ", ");
        }
    }
}