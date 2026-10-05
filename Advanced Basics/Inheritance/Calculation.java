// This class is 'inherited' to the main class
public class Calculation {

    static int n1;
    static int n2;

    public int addition(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
        int result = n1 + n2;
        return result;
    }
    public int subtraction(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
        int result = n1 - n2;
        return result;
    }
    public int multiplication(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
        int result = n1 * n2;
        return result;
    }
    public int division(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
        int result = n1 / n2;
        return result;
    }
    public double exponentiation(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
        double result = Math.pow(n1, n2);
        return result;
    }
}