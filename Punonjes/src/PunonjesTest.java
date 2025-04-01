
import java.util.Scanner;
public class PunonjesTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vendos numrin e punonjesve: ");
        int numriPunonjesve = scanner.nextInt();
        Punonjes[] punonjesArray = new Punonjes[numriPunonjesve];

        for (int i = 0; i < numriPunonjesve; i++) {
            System.out.println("Vendos ID për punonjesin " + (i + 1) + ": ");
            int ID = scanner.nextInt();
            System.out.println("Vendos emrin për punonjesin " + (i + 1) + ": ");
            String emer = scanner.next();
            System.out.println("Vendos mbiemrin për punonjesin " + (i + 1) + ": ");
            String mbiemer = scanner.next();
            System.out.println("Vendos pagën për punonjesin " + (i + 1) + ": ");
            double paga = scanner.nextDouble();

            punonjesArray[i] = new Punonjes(ID, emer, mbiemer, paga);
        }

        System.out.println("Punonjësit me pagë më të ulët se 50,000 janë:");
        for (Punonjes punonjes : punonjesArray) {
            if (punonjes.getPaga() < 50000) {
                System.out.println("ID: " + punonjes.getID() + ", Emri: " + punonjes.getEmer() + ", Mbiemri: " + punonjes.getMbiemer());
            }
        }
    }
}