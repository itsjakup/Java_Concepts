
/*//ndertimi i vektorit, paraqitja e tij
import java.util.Scanner;
public class Vectors{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] vector = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter elements " + (i + 1) + ": ");
            vector[i] = scanner.nextInt();
        }
        System.out.println("vektori i ndertuar eshte:");
        for (int i = 0; i < n; i++) {
            System.out.print(vector[i] + " ");
        }
      }
}*/



/*//shuma e vektoreve
import java.util.Scanner;
public class Vectors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("jepni permasat e vektorit: ");
        int n = scanner.nextInt();

        int[] vector1 = new int[n];
        int[] vector2 = new int[n];

        System.out.println("jepni elementet e vektorit te pare:");
        for (int i = 0; i < n; i++) {
            vector1[i] = scanner.nextInt();
        }

        System.out.println("jepni elementet e vektorit te dyte:");
        for (int i = 0; i < n; i++) {
            vector2[i] = scanner.nextInt();
        }

        int[] sum = new int[n];

        for (int i = 0; i < n; i++) {
            sum[i] = vector1[i] + vector2[i];
        }

        System.out.println("vektori shume eshte:");
        for (int i = 0; i < n; i++) {
            System.out.print(sum[i] + " ");
        }
        System.out.println();
    }
}*/


/*//renditja e vektorit
import java.util.Scanner;
  public class Vectors {
      public static void main(String args[]) {
          Scanner scanner = new Scanner(System.in);

          System.out.println("jepni permasat e vektorit: ");
          int n = scanner.nextInt();
          int[] vector = new int[n];

          int i;
          System.out.println("vendos elementet fillestare te vektorit te parenditura");
          for (i = 0; i < n; i++) {
              vector[i] = scanner.nextInt();
          }

          for (i = 0; i < n; i++) {
              int min = i;

              int j;
              for (j = i + 1; j < n; j++) {
                  if (vector[j] < vector[min]) {
                      min = j;
                  }
              }

              int temp = vector[min];
              vector[min] = vector[i];
              vector[i] = temp;
          }

          System.out.print("Vektori i renditur eshte: ");
          for (i = 0; i < n; i++) {
              System.out.print(vector[i] + " ");
          }
          System.out.println();

      }
  }*/


//rendtija nga e kunderta e vektorit


/*import java.util.Scanner;
public class Vectors {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("jep permasen e vektorit: ");
        int n = scanner.nextInt();
        int [] vector = new int[n];
        int i;

        System.out.println("vendos elementet fillestare te vektorit: ");
        for (i = 0; i < n; i++) {
            vector[i] = scanner.nextInt();
        }

        System.out.println("vektori i parenditur:");
        for (i =0; i < n; i++) {
            System.out.print(vector[i] + " ");
        }

        //e renditim nga e kunderta
        System.out.println("vektori i ri eshte: ");
        for (i = n-1; i >=0; i--) {
            System.out.print(vector[i] + " ");
        }
        System.out.println();
    }
}*/


/*//finding the longest consecutive sequence of zeros in a given vector
import java.util.Scanner;
import java.util.Vector;
public class Vectors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the dimensions: ");
        int n = input.nextInt();
        int[] v = new int[n];
        int x = 1;
        int i;
        int max = 0;
        System.out.println("Enter the elements: ");
        for (i = 0; i < n; i++) {
            v[i] = input.nextInt();
        }
        for (i = 0; i < n; i++) {
            if (v[i] == 0 && (i + 1 < n && v[i + 1] == 0)) {
                x++;
            } else if (v[i] != 0) {
                x = 0;
            }
            if (x > max) {
                max = x;
            }
        }
        System.out.println("Length of the longest sequence of consecutive zeros: " + max);
    }
}*/


/*import java.util.Scanner;
public class Vectors {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vendos gjatësinë e vektorit: ");
        int n = scanner.nextInt();
        int[] vector = new int[n];

        System.out.println("Vendos elementet e vektorit: ");
        for (int i = 0; i < n; i++) {
            vector[i] = scanner.nextInt();
        }

        int sum = 0;
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (vector[i] < 0) {
                System.out.println("Elementi negativ ne vektor eshte: " + vector[i]);
                sum += vector[i];
                count++;
            }
        }

        System.out.println("Numri i elementeve negative ne vektor eshte: " + count);
        System.out.println("Shuma e tyre eshte: " + sum);
    }
}

import java.util.Scanner;
public class Vectors {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vendos gjatësinë e vektorit: ");
        int n = scanner.nextInt();
        int[] vector = new int[n];

        System.out.println("Vendos elementet e vektorit: ");
        for (int i = 0; i < n; i++) {
            vector[i] = scanner.nextInt();
        }

        int p = 1;
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (vector[i] < 4) {
                System.out.println("Elementet me te vegjel se 4: " + vector[i]);
                p = vector[i] * p;
                count++;
            }
        }

        System.out.println("Numri i elementeve me te vegjel se 4 eshte " + count);
        System.out.println("Prodhimi i tyre eshte: " + p);
    }
}


import java.util.Scanner;
public class Vectors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Jep permasen e vektorit: ");
        int n = scanner.nextInt();
        int[] vector = new int[n];

        // Mbushim vektorin
        System.out.println("Vendosni elementet e vektorit: ");
        for (int i = 0; i < n; i++) {
            vector[i] = scanner.nextInt();
        }

        // Kontrollojme nese x gjendet ose jo ne vektor
        System.out.print("Vendosni elementin që doni të gjeni: ");
        int x = scanner.nextInt();
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (vector[i] == x) {
                count++;
            }
        }

        if (count > 0) {
            System.out.println("Elementi " + x + " gjendet " + count + " herë në vektor.");
        } else {
            System.out.println("Elementi " + x + " nuk gjendet në vektor.");
        }
    }
}

import java.util.*;

public class Vectors{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("jepni gjatësinë e vektorit: ");
        int n = input.nextInt();
        int[] numbers = new int[n];

        System.out.println("jepni elementet e vektorit:");
        for (int i = 0; i < n; i++) {
            numbers[i] = input.nextInt();
        }

        int sumOfNegatives = 0;
        double powerOfSum = 1.0;

        // Kontrollon nëse në vektor ka numra negativë, llogarit shumën dhe fuqinë e shumës
        for (int number : numbers) {
            if (number < 0) {
                sumOfNegatives += number;
                powerOfSum *= sumOfNegatives;
            }
        }

        // Shfaq rezultatin
        if (sumOfNegatives != 0) {
            System.out.println("Ka numra negative në vektor.");
            System.out.println("Shuma e numrave negative: " + sumOfNegatives);
            System.out.println("Fuqia e shumës së numrave negative: " + powerOfSum);
        } else {
            System.out.println("Nuk ka numra negative në vektor.");
        }

        input.close();
    }
}*/


import java.util.Scanner;

public class Vectors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the vector: ");
        int n = scanner.nextInt();
        int[] v = new int[n];

        // fill the vector
        System.out.println("Enter the elements of the vector: ");
        for (int i = 0; i < n; i++) {
            v[i] = scanner.nextInt();
        }

        // Declare a number x
        System.out.print("Enter a value for x: ");
        int x = scanner.nextInt();
        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n; j++) {
                if (v[i] + v[j] == x) {
                    count++;
                    System.out.println("Pair found: " + v[i] + " " + v[j]);
                }
            }
        }

        if (count == 0) {
            System.out.println("No elements satisfy the condition.");
        }

        scanner.close();
    }
}








