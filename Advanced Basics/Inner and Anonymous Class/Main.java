class Parent {
    int age = 29;
    public void showInfo() {
        System.out.println("I am " + age + " years old!");
    }
    // An inner class must be static
    // For simplicity purposes...
    static class Child {
        public void configure() {
            System.out.println("I am a child!");
        }
    }
}

class Grandparent extends Parent {} // This is an anonymous class. It has nothing in it, which makes it anoynmous.
abstract class Elder { // An anonymous class can be abstract, too!
    public abstract void printAge();
    public abstract void speakName();
}
abstract class Funcs extends Elder {}

public class Main {
    public static void main(String[] args) {
        Parent parent = new Parent();
        Parent.Child child = new Parent.Child(); // This is now to define a static inner-class

        Grandparent grand = new Grandparent() { // The anonymous class is then defined here in the main() method!
            @Override
            public void showInfo() {
                System.out.println("I am " + (age += 40) + " years old!");
            }
        };
        Elder elder = new Elder() { // Defining the abstract anonymous class...
            int age = 29;
            @Override
            public void printAge() {System.out.println("I am " + (age += 60) + " years old!");}
            
            @Override
            public void speakName() {System.out.println("My name is Charles Cogsworth.");}
        };
        elder.printAge();
        grand.showInfo();
        parent.showInfo();
        child.configure();
    }
}