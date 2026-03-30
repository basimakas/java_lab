package Arithmetic;

public class Divide implements ArithmeticOp {
    public double operation(double a, double b) {
        if (b == 0) {
            System.out.println("Cannot divide by zero");
            return 0;
        }
        return a / b;
    }
}
