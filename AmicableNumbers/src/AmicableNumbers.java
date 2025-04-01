

import java.util.Scanner;
public class AmicableNumbers {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the 1st number: ");
        int x = scanner.nextInt();
        System.out.println("enter the 2nd number: ");
        int y = scanner.nextInt();

        int sum1 = 0, sum2 = 0;
        //for the 1st number
        for(int i = 1; i<x; i++){
            if( x % i == 0) {
                sum1 += i;
            }
        }

        //for 2nd number
        for (int j =1; j<y; j++){
            if ( y % j == 0) {
                sum2 += j;
            }
        }

        if (sum1 == y && sum2 == x){
            System.out.println(" x y are amicable numbers :)");
        }else {
            System.out.println("x & y are not amicable numbers :( ");
        }
        scanner.close();

    }
}
