import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int first_number = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int second_number = scanner.nextInt();

        int sum = first_number + second_number;

        System.out.println("Sum = " + sum);

        scanner.close();
    }
}