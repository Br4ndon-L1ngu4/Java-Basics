
class Computer {

    // "void" is another name for "function"
    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            return 0.0; // Or handle the error appropriately
        }
    }

    // NOTE: You cannot have duplicate methods with the same name and parameter types.
}

public class Methods {

    public static void main(String[] args) {
        Computer puter = new Computer();

        System.out.println("Addition: " + puter.add(7.0, 3.0));
        System.out.println("Subtraction: " + puter.subtract(7.0, 3.0));
        System.out.println("Multiplication: " + puter.multiply(7.0, 3.0));
        System.out.println("Division: " + puter.divide(7.0, 3.0));
    }

    // This is a simple method that prints a welcome message
    // It must be outside the main function because that's where we run EVERYTHING.
    public static void greet() {
        System.out.println("Welcome to Java!");
    }
}
