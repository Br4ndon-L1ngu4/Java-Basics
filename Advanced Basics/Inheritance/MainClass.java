public class MainClass extends Calculation { // 'extends' means we are 'using' a class or library
    public static void main(String[] args) {
        // This function 'inherits' this class separately instead of just getting it within this file.
        Calculation calc = new Calculation();
        HyperCalc hyper = new HyperCalc();
        Derivative derivative = new Derivative();

        System.out.println(calc.addition(4, 7));
        System.out.println(calc.subtraction(4, 7));
        System.out.println(calc.multiplication(4, 7));
        System.out.println(calc.division(1000, 40));
        System.out.println(calc.exponentiation(4, 7));
        System.out.println(hyper.modulus(1000, 40));
        System.out.println(derivative.derivative(x -> x * x * x, 10));
    }
}