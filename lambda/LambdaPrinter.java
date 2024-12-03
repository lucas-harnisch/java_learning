package lambda;

@FunctionalInterface
interface Printer {
    String print(String arg1, String arg2); // Creating INterface
}

public class LambdaPrinter {

    public static void main(String[] args) {
        // Lambda Expression vor Merging the 2 Arguments
        Printer printer = (arg1, arg2) -> {
            return arg1 + arg2; 
        };

        // Using the Lambda Expression
        String result = printer.print("Hello, ", "Lambda!");
        System.out.println(result); 
    }
}
