
/*
decimalet ne binare
import java.util.Scanner;
public class Numbers{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a decimal number");
        int decimal = scanner.nextInt();

        StringBuilder binary = new StringBuilder();

        if (decimal == 0) {
            binary.append(0);
        } else {
            while (decimal > 0) {
                int remainder = decimal % 2;
                binary.insert(0, remainder);
                decimal = decimal / 2;
            }
        }

        System.out.println("Binary number is: " + binary);
    }
}

import javax.swing.*;
import java.util.Scanner;
public class Numbers {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the dimensions of the vector: ");
        int n = scanner.nextInt();
        int[] vector = new int[n];
        int i;
        //vendosja e elementeve te vektorit
        for (i = 0; i < n; i++) {
            vector[i] = scanner.nextInt();
        }
        for (i = 0; i < n; i++) {
            if (vector[i] % 2 == 0) {
                System.out.println("element at the index " + i + " is even numbers :)");
            } else
                System.out.println("element at the index " + i + " is odd numbers :(");
        }
    }
}


import java.util.Scanner;
public class Numbers{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        int sum = 0, reminder = 0;
        int numriFillestar = number;

        while (number != 0){
            reminder = number % 10;
            sum += reminder;
            System.out.print(reminder + " ");
            number /= 10;
        }

        System.out.println(" jane shifrat e numrit \n dhe shuma e shifrave eshte " + sum);
    }
}*/


/*import java.util.Scanner;
public class Numbers{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a decimal number: ");
        int decimal = scanner.nextInt();

        int binary = 0;

        if (decimal == 0) {
            binary = 0;
        } else {
            int x = 1;
            while (decimal != 0) {
                int remainder = decimal % 2;
                binary = remainder + binary * x;
                x *= 10;
                decimal = decimal / 2;
            }
        }

        System.out.println("Binary number is: " + binary);
    }
}*/

import java.util.Scanner;
public class Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a decimal number: ");
        int decimal = scanner.nextInt();
        String binary = "";
        if (decimal == 0) {
            binary = "0";
        } else{
            while (decimal > 0) {
                int remainder = decimal % 2;
                binary = remainder + binary;
                decimal = decimal / 2;
            }
        }
        System.out.println("Binary number is: " + binary);
    }
}