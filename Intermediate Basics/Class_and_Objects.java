
public class Class_and_Objects {

    public static void main(String[] args) {

        // A class is basically a blueprint for creating objects.
        class Person {

            String first_name;
            String last_name;
            int age;
        }

        // You can use the blueprint to create an object, which is an instance of the class.
        Person person1 = new Person();
        person1.first_name = "John";
        person1.last_name = "Doe";
        person1.age = 27;

        // You can create as many objects as you want from the same class as long as they have the same parameters as the class contains.
        Person person2 = new Person();
        person2.first_name = "Jane";
        person2.last_name = "Doe";
        person2.age = 25;

        System.out.println("First Name: " + person1.first_name);
        System.out.println("Last Name: " + person1.last_name);
        System.out.println("Age: " + person1.age);

        System.out.println();

        System.out.println("First Name: " + person2.first_name);
        System.out.println("Last Name: " + person2.last_name);
        System.out.println("Age: " + person2.age);

        // PERSONAL NOTE: I love the structure of classes and objects! Very optimized and easy to read.
    }
}
