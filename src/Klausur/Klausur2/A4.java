package src.Klausur.Klausur2;

import src.annotation.author;

// Aufgabe 4 in Beispielklausur 2 für PR1 SoSe2024 

@author(name = "Lucas Harnisch")
public class A4 {




    public static void main(String[] args) {

        System.out.println(sequence("00110010000000111111111111110000000000000010101001011100"));

    }
    
    static String sequence(String value) {

        String output = "Nullsequenzen: ";

        for (int i = 0; i < value.length(); i++){

            char currentchar = value.charAt(i);

            if (currentchar != '0' && currentchar != '1' )
            return "Die Zahlenfolge enhält ungültige Zeichen!";

            if (currentchar== '0') {

                output += "0";
            }
            if (currentchar == '1') {

                output += " ";
            }
            ;
        }
        return output.trim(); 


    }
}
