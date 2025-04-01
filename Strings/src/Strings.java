
import javax.xml.namespace.QName;
import java.util.Scanner;

/*public class Strings {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a string: ");
        String string = scanner.nextLine();
        System.out.println("Stringu i dhene eshte " + "'" + string.toUpperCase() + "'" +
                " \nGjatesia e stringut eshte " + string.length());
    }
}

public class Strings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter 2 strings; ");
        System.out.println("enter the first string: ");
        String s1 = scanner.nextLine();
        System.out.println(" enter the second string: ");
        String s2 = scanner.nextLine();

        if (s1.equals(s2)){
            System.out.println("stringjet jane te njejte;");
        }else {
            System.out.println("stringjet nuk jane te njejte;");
        }
    }

}*/

public class Strings{
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a string: ");
        String string = scanner.nextLine();

        if (!string.isEmpty()){
            String result = string.substring(0,1).toUpperCase() + string.substring(1).toLowerCase();
            System.out.println(result + " is the new string capitalised");
        }
    }
}



