

import java.util.*;
public class calculator {
    public static void main(String[] args){
        char addition = '+';
        char substraction = '-';
        char multiplying = '*';
        char division = '/';
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number you want to add, substract, multiply or divide:");
           float first_number = scanner.nextInt();
        System.out.println("Enter the symbol you want apply: ");
           char operation = scanner.next().charAt(0);
        System.out.println("Enter the next number you want to add, substract, multiply or divide:");
           float next_number = scanner.nextInt();

          float result = 0;

         switch (operation){
            case '+':
                result = first_number + next_number;
                break;
            case '-':
                result = first_number - next_number;
                break;
            case '*':
                result = first_number * next_number;
                break;
            case '/':
                result = first_number / next_number;
                break;
            default:
                System.out.println("Invalid operation");
                break;
            }
             System.out.println("Result = " + result);

          scanner.close();
    }
}