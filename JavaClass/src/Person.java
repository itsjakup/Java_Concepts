
/*import java.util.Scanner;
public class Person{
    private String name;

    // Get method
    public String getName(){
        return name;
    }

    // Set method
    public void setName(String newName){
        this.name = newName;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String name = new String();
        Person person = new Person();
        person.setName("Name: ");

        String personName = person.getName();
        System.out.println("Person's name: " + personName);
    }
}*/

public class Person {
    private String name;
    public Person setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }
}

  /*Person person = new Person().setName("Jakup Ymeraj").setAge(21);*/