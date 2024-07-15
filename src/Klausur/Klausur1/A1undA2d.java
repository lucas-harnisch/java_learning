package src.Klausur.Klausur1;

import src.annotation.author;

// Aufgabe 1 in Beispielklausur 1 für PR1 SoSe2024 + Aufgabe 2d


@author(name = "Lucas Harnisch")
public class A1undA2d {

public static void main(String[] args) {
        

int w = f(2,3); // Aufgabe 1
System.out.println("Der Wert ist: " + w );
System.out.println("");
rek(4); // Aufgabe 2d 


    }
// Aufgabe 1
static int f(int z, int x){
        System.out.println(z + " " + x);

        if (z == x) {
            return 1;
        }
        if (z == 0) {
            return 1;
        }
    return  f(z, x-1) + f(z-1,x-1);
   

}
// Aufgabe 2d
public static void rek(int z) {
    z--;
    System.out.println(z);
    if (z != 0) {
        rek(z);
    }
    System.out.println(z);
    
}


}
