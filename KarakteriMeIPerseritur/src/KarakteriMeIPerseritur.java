
import java.util.Scanner;
public class KarakteriMeIPerseritur {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vendos nje fjale: ");
        String teksti = scanner.nextLine();
        char karakteriIPerseritur = gjejKarakterinIPerseritur(teksti);

        if (karakteriIPerseritur == '\0') {
            System.out.println("Nuk ka karaktere që perseriten.");
        } else {
            int numriIPerseritur = numriKarakteritIPerseritur(teksti, karakteriIPerseritur);
            System.out.println("Karakteri që perseritet më shumë eshte  " + karakteriIPerseritur +
                    " dhe perseritet " + numriIPerseritur + " here.");
        }
    }

    public static char gjejKarakterinIPerseritur(String teksti) {
        int count = 0;
        char karakteriIPerseritur = '\0';

        for (int i = 0; i < teksti.length(); i++) {
            char currentChar = teksti.charAt(i);
            int currentCount = 0;

            for (int j = 0; j < teksti.length(); j++) {
                if (teksti.charAt(j) == currentChar) {
                    currentCount++;
                }
            }

            if (currentCount > count) {
                count = currentCount;
                karakteriIPerseritur = currentChar;
            }
        }

        return karakteriIPerseritur;
    }

    public static int numriKarakteritIPerseritur(String teksti, char karakteri) {
        int count = 0;

        for (char c : teksti.toCharArray()) {
            if (c == karakteri) {
                count++;
            }
        }

        return count;
    }
}