package Klausur.Klausur2;

import annotation.author;

// Aufgabe 1a in Beispielklausur 2 für PR1 SoSe2024 

@author(name = "Lucas Harnisch")
public class A1a { 
    public static void main(String[] args) {
        // Beispielaufruf für ein Ausgangsbrett der Länge 3
        brettlaengen(3, "");
    }
    private static void brettlaengen(int laenge, String prefix) {
    
        // Rekursiver Fall 2: Ein Brett der Länge 2 hinzufügen, falls Platz ist
        if (laenge >= 2) {
        brettlaengen(laenge - 2, prefix + "2 ");}

        // Rekursiver Fall 1: Ein Brett der Länge 1 hinzufügen, falls Platz ist
        if (laenge >= 1) {
        brettlaengen(laenge - 1, prefix + "1 ");}
                                
        if (laenge == 0) { // Beendigung --> Basisfall
            System.out.println(prefix);
            return;
        }
    }
}

