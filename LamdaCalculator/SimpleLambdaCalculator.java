package LamdaCalculator;

public class SimpleLambdaCalculator  {



    public static void main(String[] args) {
        
           CalculatorOperation<Integer> calculator = (a,b,operation) -> {

            switch (operation) {
                case '+': return a+b;
                case '-': return a-b;
                case '*': return a*b;
                case '/': return a/b;
                default: throw new IllegalArgumentException("Operation not known");


    }



    };

    System.out.println(calculator.calc(4, 10, '-'));



}}







