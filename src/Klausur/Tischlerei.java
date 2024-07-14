package src.Klausur;
public class Tischlerei {

    public static void brettlaengen(int laenge) {
        // Hilfsmethode aufrufen, um Kombinationen zu finden
        findCombinations(laenge, "");
    }

    private static void findCombinations(int laenge, String prefix) {
        // Basisfall: Wenn die Länge 0 ist, ist dies eine gültige Kombination
        if (laenge == 0) {
            System.out.println(prefix.trim());
            return;
        }

        // Rekursiver Fall 1: Ein Brett der Länge 1 hinzufügen, falls Platz ist
        if (laenge >= 1) {
            findCombinations(laenge - 1, prefix + "1 ");
        }

        // Rekursiver Fall 2: Ein Brett der Länge 2 hinzufügen, falls Platz ist
        if (laenge >= 2) {
            findCombinations(laenge - 2, prefix + "2 ");
        }
    }

    public static void main(String[] args) {
        // Beispielaufruf für ein Ausgangsbrett der Länge 3
        brettlaengen(6);
    }
}

