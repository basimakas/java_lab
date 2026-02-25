
import java.util.Scanner;

public class ComplexNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter real and imaginary part of first number: ");
        double r1 = sc.nextDouble();
        double i1 = sc.nextDouble();

        System.out.print("Enter real and imaginary part of second number: ");
        double r2 = sc.nextDouble();
        double i2 = sc.nextDouble();

        double realSum = r1 + r2;
        double imgSum = i1 + i2;

        System.out.println("Sum is: " + realSum + " + " + imgSum + "i");

        sc.close();
    }
}

