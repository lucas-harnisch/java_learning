package src.recursion;

import src.annotation.author;

// implements an recursive algorithm for the Fabonnaci calculation

@author(name = "Lucas Harnisch")

public class Fibonacci {
    public static void main(String[] args) {
        int n = 42; 
        System.out.println("Fibonacci number at position " + n + " is: " + fibonacci(n));
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
