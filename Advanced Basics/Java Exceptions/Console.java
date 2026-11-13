interface Funcs {
    void log(String str);
    void line(String str);
    void num(double n);
}
interface Arithmetic {
    void add(double n1, double n2) throws ArithmeticZeroException;
    void sub(double n1, double n2) throws ArithmeticZeroException;
    void div(double n1, double n2) throws ArithmeticZeroException;
    void mult(double n1, double n2) throws ArithmeticZeroException;
}
public class Console implements Funcs, Arithmetic {
    public double result;

    @Override public void log(String str) {System.out.println(str);}
    @Override public void line(String str) {System.out.print(str);}
    @Override public void num(double n) {System.out.println((int) n);}

    @Override public void add(double n1, double n2) throws ArithmeticZeroException {
        result = n1 + n2;

        try {if(n1==0 || n2==0) {throw new ArithmeticZeroException("ERROR: Cannot divide by zero.");}} 
        catch(ArithmeticException e) {System.out.println("ERROR");}
    }
    @Override public void sub(double n1, double n2) throws ArithmeticZeroException {
        result = n1 - n2;

        try {if(n1==0 || n2==0) {throw new ArithmeticZeroException("ERROR: Cannot divide by zero.");}} 
        catch(ArithmeticException e) {System.out.println("ERROR");}
    }
    @Override public void div(double n1, double n2) throws ArithmeticZeroException {
        result = n1 / n2;

        // If any of these values are zero, then we'll give out a new exception.
        // We'll 'throw' a 'new' exception:
        if(n1 == 0 || n2 == 0) {throw new ArithmeticException("ERROR: Cannot divide by zero.");}
        // If-Statement           // Throwing the exception       // Exception message
        else {System.out.println(result);}
    }
    @Override public void mult(double n1, double n2) throws ArithmeticZeroException { // Making sure the custom exception can be used
        result = n1 * n2;
        
        // This is a custom exception:
        try {if(n1==0 || n2==0) {throw new ArithmeticZeroException("ERROR: Cannot divide by zero.");}} 
        catch(ArithmeticException e) {System.out.println("ERROR");}
    }
}

class ArithmeticZeroException extends Exception { // This uses the Exception class
    public ArithmeticZeroException(String except) { // Constructor
        super(except); // This is a high-priority message created by this Exception and it MUST BE super()!
    }
}