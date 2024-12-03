package lambda;

// Calculator functional interface
@FunctionalInterface
interface Calculator {
    int calculate(int a, int b);
}

public class LambdaCalculator {

    public static void main(String[] args) {
        // Lambda expression for addition
        Calculator addition = (a, b) -> a + b;

        // Lambda expression for subtraction
        Calculator subtraction = (a, b) -> a - b;

        // Lambda expression for multiplication
        Calculator multiplication = (a, b) -> a * b;

        // Lambda expression for division
        Calculator division = (a, b) -> a / b;

        // Performing addition
        System.out.println("The result of addition is: " + addition.calculate(5, 7));

        // Performing subtraction
        System.out.println("The result of subtraction is: " + subtraction.calculate(5, 7));

        // Performing multiplication
        System.out.println("The result of multiplication is: " + multiplication.calculate(5, 7));

        // Performing division
        System.out.println("The result of division is: " + division.calculate(10, 2));
    }
}
