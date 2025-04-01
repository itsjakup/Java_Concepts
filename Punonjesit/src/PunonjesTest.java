
import java.util.*;
public class PunonjesTest {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Punonjes> punonjesit = new ArrayList<>();

    System.out.println("Vendos numrin e punonjesve: ");
    int numri = scanner.nextInt();
    scanner.nextLine(); // Consume newline left-over

    System.out.println("Vendos te dhenat e tyre: ");
    for (int i = 1; i <= numri; i++) {
        System.out.println("Punonjesi: " + i + ": ");
        System.out.println("ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Emri: ");
        String emri = scanner.nextLine();
        System.out.println("Mbiemri: ");
        String mbiemri = scanner.nextLine();
        System.out.println("Mosha: ");
        int mosha = scanner.nextInt();
        System.out.println("Paga: ");
        int paga = scanner.nextInt();

        Punonjes punonjes = new Punonjes(id, emri, mbiemri, mosha, paga);
        punonjesit.add(punonjes);

        //System.out.println("\nTe gjithe punonjesit jane: " + punonjes);
        System.out.println("ID: " + punonjes.getId() + "\nEmri: " + punonjes.getEmri() +
                "\nMbiemer: " + punonjes.getMbiemri() + "\nMosha: " + punonjes.getMosha() +
                "\nPaga: " + punonjes.getPaga());
    }

    ArrayList<Punonjes> pensionistet = gjejPensionistet(punonjesit);
    System.out.println("\nPensionistet jane: ");
    for (Punonjes pensionisti : pensionistet) {
        System.out.println(pensionisti.getEmri());
    }
}

    private static ArrayList<Punonjes> gjejPensionistet(ArrayList<Punonjes> punonjesit) {
        return punonjesit;
    }
}
