package sort;

import java.util.ArrayList;
import java.util.Random;

public class Generator {

        //create new Array List
        ArrayList<Integer> toSort = new ArrayList<>();

        public static ArrayList<Integer> numberGenerator(int times) {
            ArrayList<Integer> toSort = new ArrayList<>();
            Random generator = new Random();
    
            // Füge 'times' Zufallszahlen zur Liste hinzu
            for (int i = 0; i < times; i++) {
                int randomNumber = generator.nextInt(10000); // Zufallszahl zwischen 0 und 100000
                toSort.add(randomNumber); // Zahl zur Liste hinzufügen
            }
    
            return toSort; // Liste von Zufallszahlen zurückgeben
        }
}
