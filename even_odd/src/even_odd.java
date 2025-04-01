

import java.util.*;
public class even_odd {
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the number you want to check: ");
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.print("the given number is even");
        } else {
            System.out.print("the given number is odd");
        }
        scanner.close();
    }
}