package src.Klausur.Klausur2;

import src.annotation.author;

// Aufgabe 3 in Beispielklausur 2 für PR1 SoSe2024 

@author(name = "Lucas Harnisch")
public class A2c {
    

    
    public static void main(String[] args) {
        
        int a = 2;
        int b = 10;
        int i = 0;

        System.out.println();
        System.out.println("Value before loop: ");
        System.out.println("Value of a: " + a);
        System.out.println("Value of b: " + b +"\n");


        do {
            a = a +1;
            b = (a%2 == 0 ? b + 1 : b -3);

            System.out.println("Loop: " + i);
            System.out.println("Value of a: " + a);
            System.out.println("Value of b: " + b +"\n");    

            i++;

        } while (a < b);

        System.out.println("Final values: ");
        System.out.println("a = " + a);
        System.out.println("b = "+ b);
 

        
    }


    

}
