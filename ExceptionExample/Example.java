package ExceptionExample;


import java.io.FileNotFoundException;
import java.io.FileReader;


import ExceptionExample.Example2;

public class Example {

    protected static String className = "Example";

    public static void main(String[] args){

//        Example.printAverage(0, 2,2,6);

        Example2 test = new Example2();


       // PeriodNegativeOrNullException example = new PeriodNegativeOrNullException();
        // System.out.println(example);

        try {
        test.clone();}
        catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        

    }


    protected void printMessage() {
        System.out.println("Hello");
    }

    


    




    // methode to read a file
    public static void readFile(String path)throws FileNotFoundException{

  FileReader reader = new FileReader(path);

    }


    //method for printing an average
    public static void printAverage(int x, int... numbers) {

        int result = 0;
        int sum = 0;

        try {

            for(int i = 0; i < numbers.length; i++) {
                sum += numbers[i];
            }

            result = sum / x;
            System.out.println(result);

        }
        catch (ArithmeticException e) {
        e.printStackTrace();        }
    }


    public static int convertStringToInt(String input) {

        try {
        return Integer.parseInt(input);}
        catch (Exception e) {
            e.printStackTrace();
            return -1;
             }
        finally {
            System.out.println("I am inside the final block");
        }     
    }

}
