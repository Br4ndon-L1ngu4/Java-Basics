import java.util.Scanner;

interface BasicArhyth {
    void add(Double fNum, Double sNum);
    void sub(Double fNum, Double sNum);
    void mult(Double fNum, Double sNum);
    void div(Double fNum, Double sNum);
}

interface AdvancedArhyth {
    void exp(Double fNum, Double sNum);
    void mod(Double fNum, Double sNum);
    void sqrt(Double fNum);
}

interface Trig {
    void sin(double fNum);
    void tan(double fNum);
    void cos(double fNum);
    
    void sinh(double fNum);
    void tanh(double fNum);
    void cosh(double fNum);
}

class Calculator implements BasicArhyth, AdvancedArhyth, Trig {
    Scanner scanner = new Scanner(System.in);

    @Override
        public void add(Double fNum, Double sNum) {System.out.println(fNum + sNum);}@Override
        public void sub(Double fNum, Double sNum) {System.out.println(fNum - sNum);}@Override
        public void mult(Double fNum, Double sNum) {System.out.println(fNum * sNum);}@Override
        public void div(Double fNum, Double sNum) {System.out.println(fNum / sNum);}

    //*---------------------------------------------------------------------*\\
    @Override
        public void exp(Double fNum, Double sNum) {System.out.println(Math.pow(fNum, sNum));}@Override
        public void mod(Double fNum, Double sNum) {System.out.println(fNum % sNum);}@Override
        public void sqrt(Double fNum) {System.out.println(Math.sqrt(fNum));}

    //*---------------------------------------------------------------------*\\
    @Override
        public void sin(double fNum) {System.out.println(Math.sin(fNum));}@Override
        public void tan(double fNum) {System.out.println(Math.tan(fNum));}@Override
        public void cos(double fNum) {System.out.println(Math.cos(fNum));}
    
    @Override
        public void sinh(double fNum) {System.out.println(Math.sinh(fNum));}@Override
        public void tanh(double fNum) {System.out.println(Math.tanh(fNum));}@Override
        public void cosh(double fNum) {System.out.println(Math.cosh(fNum));}

    public void calculate() {
        System.out.println("Enter the operator:");
        String op = scanner.nextLine();

        if(
            op.equals("+") || 
            op.equals("-") || 
            op.equals("*") || 
            op.equals("/") || 
            op.equals("^") || 
            op.equals("%")
        ) {
            System.out.println("Enter the first number:");
            Double first = scanner.nextDouble();

            System.out.println("Enter the second number:");
            Double second = scanner.nextDouble();

            switch(op) {
                case "+" -> {add(first, second);}
                case "-" -> {sub(first, second);}
                case "*" -> {mult(first, second);}
                case "/" -> {div(first, second);}

                case "^" -> {exp(first, second);}
                case "%" -> {mod(first, second);}
                default -> {System.out.println("ERROR: Unrecognized operation. Please try again.");}
            }
        } else if(
            op.equals("sqrt") ||
            op.equals("sin") || 
            op.equals("sinh") || 
            op.equals("tan") || 
            op.equals("tanh") || 
            op.equals("cos") || 
            op.equals("cosh")
        ) {
            System.out.println("Enter your number:");
            double num = scanner.nextDouble();

            switch(op) {
                case "sqrt" -> {sqrt(num);}

                case "sin" -> {sin(num);}
                case "sinh" -> {sinh(num);}

                case "tan" -> {tan(num);}
                case "tanh" -> {tanh(num);}

                case "cos" -> {cos(num);}
                case "cosh" -> {cosh(num);}
                default -> {System.out.println("ERROR: Unrecognized operation. Please try again.");}
            }
        }
    }
}

public class AdvancedCalculator {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.calculate();
    }
}