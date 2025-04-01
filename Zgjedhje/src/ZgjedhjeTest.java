
import java.util.ArrayList;
import java.util.Scanner;
public class ZgjedhjeTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Zgjedhje> zgjedhjet = new ArrayList<>();

        // Vendosja e informacionit për disa kandidatë nga përdoruesi
        System.out.println("Vendos numrin e kandidateve: ");
        int n = scanner.nextInt();
        System.out.println("Vendosni informacionin për kandidatët:");
        for (int i = 1; i <= n; i++) {
            System.out.println("Kandidati " + i + ":");
            System.out.print("ID: ");
            int ID = scanner.nextInt();
            scanner.nextLine(); // Çdo herë që përdorni nextInt,
            // paraqitet nevoja për këtë
            System.out.print("Emri: ");
            String emri = scanner.nextLine();
            System.out.print("Mbiemri: ");
            String mbiemri = scanner.nextLine();
            System.out.print("Numri i votave: ");
            int numriVotave = scanner.nextInt();

            Zgjedhje zgjedhje = new Zgjedhje(ID, emri, mbiemri, numriVotave);
            zgjedhjet.add(zgjedhje);
        }

        // Afishimi i të gjithë kandidatëve
        System.out.println("\nTë gjithë kandidatët në zgjedhje:");
        for (Zgjedhje zgjedhje : zgjedhjet) {
            System.out.println("ID: " + zgjedhje.getID() + ", Emri: " + zgjedhje.getEmri() + " "
                    + zgjedhje.getMbiemri() + ", Numri i votave: " + zgjedhje.getNumriVotave());
        }

        // Gjetja e fituesit
        Zgjedhje fituesi = Zgjedhje.gjejFituesin(zgjedhjet);
        System.out.println("\nFituesi i zgjedhjeve është: " + fituesi.getEmri() + " " + fituesi.getMbiemri());
    }
}
