

/*public class StudentTest{
        public static void main(String[] args) {
            Student S1 = new Student("Emri: ", "Mbiemri: ", 21, "Lendet: ");
            System.out.println("Emri: Jakup " + S1.getEmri() + ", Mbiemri: Ymeraj " + S1.getMbiemri() + ", Mosha: 21 " + S1.getMosha() + ", Lendet: " + S1.getLendet());
        }
}*/


import java.util.Scanner;
public class StudentTest {
    public static int main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the credentials: emer, mbiemer, id dhe noten: ");
        System.out.println("emri: ");
        String emri = scanner.next();
        System.out.println("mbiemri: ");
        String mbiemri = scanner.next();
        System.out.println("Id: ");
        int id = scanner.nextInt();
        System.out.println("nota: ");
        int nota = scanner.nextInt();

        Student student = new Student( emri, mbiemri, id, nota);
        gjejJoKaluesit(student);
    }

    public static int gjejJoKaluesit(Student student) {
        String emri = student.getEmri();
        String mbiemri = student.getMbiemri();
        int nota = student.getNota();
        int id = student.getId();
        // System.out.println(emri + mbiemri + id + nota);
        if (nota < 5) {
            System.out.println(student.setEmri() + student.setMbiemri() + student.setId() + student.setNota());
        } else {
            System.out.println("Studenti me emrin " + emri + " " + mbiemri + " me id: "
                    + id + " dhe me noten: " + nota + " nuk ka kaluar.");
        }
        return nota;
    }
}