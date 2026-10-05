
public class HyperCalc {

    static int n1;
    static int n2;

    public double modulus(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
        double result = n1 % n2;
        return result;
    }
}