package src.Klausur.Klausur2;
import src.annotation.author;

// Aufgabe 3 in Beispielklausur 2b für PR1 SoSe2024 

@author(name = "Lucas Harnisch")
public class A2b {
    

    public static void main(String[] args) {
        
        int a = 2;
        int b = 1;


        System.out.println(a);
        System.out.println(b +"\n");


        for (int i = 0; i<3; b *= a-b, i++) {
            a += a*1;

            System.out.println(i + ". Loop");
            System.out.println("Value of a: " + a);
            System.out.println("Value of b: " + b +"\n");

        }

        System.out.println("Final values: ");
        System.out.println("a = " + a);
        System.out.println("b = "+ b);
 

        
    }


    

}