
import java.util.*;
public class MinMax {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first integer you want to compare: ");
        int first_number = scanner.nextInt();
        System.out.println("Enter the second integer you want to compare: ");
        int second_number = scanner.nextInt();
        int min = 0;
        int max = 0;
        if (first_number > second_number) {
            first_number = max;
            second_number = min;
            System.out.println("First number is a maximum between two given integers!");
            System.out.println("Second number is a minimum between two given integers!");
        }
        else {
            first_number = min;
            second_number = max;
            System.out.println("First number is a minimum between two given integers!");
            System.out.println("Second number is a maximum between two given integers!");

        }
        scanner.close();
    }
}
