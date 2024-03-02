import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a number to find its square root: ");
            double num = scanner.nextDouble();
            if (num < 0) {
                throw new ArithmeticException("Cannot calculate square root of a negative number.");
            } else {
                double squareRoot = Math.sqrt(num);
                System.out.println("Square root of " + num + " is: " + squareRoot);
            }
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
