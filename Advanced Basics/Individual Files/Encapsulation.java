
import java.util.Scanner;

class Person {

    // Since these variables are private, they cannot be accessed directly from outside the class.
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) { // Because this is a function, it must have a parameter and its respective data type!
        this.name = name; // the "this" keyword is used to refer to the current instance of 'this' class.
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Age cannot be negative.");
        }
    }
}

public class Encapsulation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter name: ");
        String name = scanner.nextLine();

        System.out.println("Enter age: ");
        int age = scanner.nextInt();

        Person person = new Person();
        person.setName(name);
        person.setAge(age);

        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }
}
