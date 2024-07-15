package src.arithmetics;

import src.annotation.author;


@author(name = "Lucas Harnisch")

public class simple_arithmetics {

    public static void main(String[] args) {
        
        // The task is to see, what the output will be, when printing out

        int x = 21;
        int y = 21;
        int z = 21;
        int i = 21;
        int e = 21;


        x = 11 / 5;
        y = 11 % -5;
        z += 11 - 5;
        i *= 11 / 5;
        e /= 11 % 5;

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(i);
        System.out.println(e);
    }
    
}
