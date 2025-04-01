import java.util.Scanner;

public class NumratEPersosur {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Futni një numër: ");
        int number = scanner.nextInt();
        int sum = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        if (sum == number) {
            System.out.println(number + " është numër i përsosur");
        } else {
            System.out.println(number + " nuk është numër i përsosur");
        }

        System.out.println("Shuma e faktorëve të numrit është: " + sum);

        scanner.close();
    }
}
