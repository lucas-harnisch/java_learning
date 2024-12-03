package Klausur.Klausur1;

import java.util.ArrayList;

public class A3 {

    public static void main(String[] args) {
        ArrayList<Integer> inputList = new ArrayList<>(); // Erstellung einer neuen Array Liste

        // Werte hinzufügen
        inputList.add(1);
        inputList.add(2);
        inputList.add(3);
        inputList.add(4);

        
        // Aufruf der Methode zur Umkehrung der Liste
        ArrayList<Integer> reversedList = reverseList(inputList);
        
        // Ausgabe der ursprünglichen Liste
        System.out.println("Ursprüngliche Liste: " + inputList);

        //Ausgabe der getauschtn Liste
        System.out.println("Umgekehrte Liste: " + reversedList);
    }
    
    // Methode zur Umkehrung einer Liste von ganzen Zahlen
    static ArrayList<Integer> reverseList(ArrayList<Integer> input) {
        ArrayList<Integer> reversed = new ArrayList<>();
        
        // Iteriere von hinten nach vorne durch die Eingabliste
        for (int i = input.size() - 1; i >= 0; i--) {
            reversed.add(input.get(i));
        }
        
        return reversed;
    }
}

