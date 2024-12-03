// simple demonstration of recursion in java with factorial


//used package
package recursion;

//imports
import java.util.Scanner;
import annotation.*;

// author decleration
@author(name = "Lucas Harnisch")

// start of the class
public class recursionExplanation {


    //calling the method
    public static void main(String[] args) {
        
        // creating scanner object
        Scanner user_input = new Scanner(System.in);


        //asking for input
        System.out.println("Please insert an positive integer value: ");

        // getting user input and save it in a variable
        int num_input = user_input.nextInt();

        // method call
        int result = factorial(num_input);

        if (result == -1){
            // handeling negative input
            System.out.println("Negative input is not allowed.");}

        
        else {
        // printing the result to the output
        System.out.println("The result of the operation is: "+result);}


        // closing scanner
        user_input.close();
    }
    

// method for factorial

private static int factorial(int value){

// algorithm for factorial

// if value is = 0r 1
if (value == 0 || value == 1) {

    return 1;
// if value is negative return -1    
}
if (value < 0) {

    return -1;
}
else
{
int result = value *factorial(value-1); // using recusrion to call the method again
return result;
}

}
}