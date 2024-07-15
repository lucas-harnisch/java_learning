package src.recursion;

import src.annotation.author;


// implements an recursive algorithm for facualty

@author(name = "Lucas Harnisch")
public class Facualty {

    public static void main(String[] args) {
        
        int x = 4;
        System.out.println("The facualty of " + x + " is: "+ facualty(x));
    }

    static public int facualty(int x) {

        if (x == 0) 
            return 1;
        else 
            return x * facualty(x - 1);

    }
    
}
