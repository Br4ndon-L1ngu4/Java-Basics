import java.util.Scanner;

final class Person { // This class is just a class that can't be changed.
    private String fName;
    private String lName;

    public void setFirstName(String fName) {this.fName = fName;}
    public void setLastName(String lName) {this.lName = lName;}
}
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Console console = new Console();
        Person object = new Person();

        System.out.println("Greeting Message: ");
        final String greeting = scanner.nextLine(); // This is basically JavaScript's 'const' keyword.
        System.out.println("Farewell Message: ");
        final String farewell = scanner.nextLine(); // A final variable cannot be changed.

        // All this means is that these two variables being set here are constant. No changes allowed.
        console.setGreeting(greeting);
        console.setFarewell(farewell);

        object.setFirstName("John");
        object.setLastName("Doe");
        
        System.out.println(greeting);
    }
}