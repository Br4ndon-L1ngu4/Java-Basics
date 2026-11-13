interface Funcs {
    void log(String str);
    void line(String str);
    void num(double n);
}
interface Arithmetic {
    void add(int n1, int n2);
    void sub(int n1, int n2);
    void div(int n1, int n2);
    void mult(int n1, int n2);
}
class Console implements Funcs, Arithmetic {
    public double result;

    @Override public void log(String str) {System.out.println(str);}
    @Override public void line(String str) {System.out.print(str);}
    @Override public void num(double n) {System.out.println((int) n);}

    @Override public void add(int n1, int n2) {
        result = n1 + n2;
        System.out.println(result);
    }
    @Override public void sub(int n1, int n2) {
        result = n1 - n2;
        System.out.println(result);
    }
    @Override public void div(int n1, int n2) {
        result = n1 / n2;
        System.out.println(result);
    }
    @Override public void mult(int n1, int n2) {
        result = n1 * n2;
        System.out.println(result);
    }
}

public class Main {
    public static void main(String[] args) {
        Console console = new Console();

        try {console.div(10,0);} // This says, "Hey, I'm going to TRY to divide 10 by 0"
        catch(ArithmeticException e) {console.log("ERROR: Cannot divide by zero.");}
        // This CATCHes the error and replaces it with the above message

        Integer ints[] = new Integer[10];
        try {
            console.num(ints[1]);
            console.num(ints[7]);
        // There are several kinds of exceptions that can be caught
        } catch(ArrayIndexOutOfBoundsException e) {
            console.log("ERROR: " + e);
        } catch(Exception e) {
            console.log("ERROR: " + e);
        }
    }
}
