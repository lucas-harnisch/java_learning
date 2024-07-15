package src.Klausur.Klausur2;

import src.annotation.author;

// Aufgabe 1b in Beispielklausur 2 für PR1 SoSe2024 
// Hier soll ein Dreieck ausgegeben werden, mit der Anzahl an x eingegebenen Zahlen 


@author(name = "Lucas Harnisch")
public class A1b {

    // Zur Verwirklichung einen nested for loop verwenden

    public static void main(String[] args) {        
        dreieck(9);
    }

    // Zur Verwirklichung einen nested for loop verwenden
    public static void dreieck(int x){

        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
                
            }
            System.out.println();
        }

    }

    
}