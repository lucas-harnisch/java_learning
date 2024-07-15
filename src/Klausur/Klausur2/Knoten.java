package src.Klausur.Klausur2;

import src.annotation.author;

// Aufgabe 3 in Beispielklausur 2 für PR1 SoSe2024 

@author(name = "Lucas Harnisch") 
class Knoten {

    // Instanzvariablen
    private int wert;
    private Knoten naechster;

    // Konstruktor
    Knoten(int w, Knoten n) {
        setWert(w);
        setNaechster(n);
    }
    // Knoten für leeren Konstruktor
    Knoten() {


    }

    // bekomme Wert 
    int getWert() {
        return wert;
    }

    // setze Wert
    void setWert(int w) {
        wert = w;
    }

    // bekomme nächsten Knoten
    Knoten getNaechster() {
        return naechster;
    }

    // setze nächsten Knoten
    void setNaechster(Knoten n) {
        naechster = n;
    }



    // ÜBERPRÜFE ob Knoten vorkommt
    static boolean kommtVor(Knoten a, int x) {



        while (a  != null) {

            if (a.getWert() == x) {

                return true;
            }
            
            a = a.getNaechster();

        }
        
        return false;
    }

    // Methode zum Ausgeben der gesamten verketteten Liste
        static void druckeListe(Knoten start) {
            Knoten aktuellerKnoten = start;
            while (aktuellerKnoten != null) {
                System.out.print(aktuellerKnoten.getWert() + "<>"); // Verkettung sichtbar machen
                aktuellerKnoten = aktuellerKnoten.getNaechster();
            }
            System.out.println();
        }



    public static void main(String[] args) {
        // Anlegen des ersten Knotens
        Knoten first_Knoten = new Knoten();  
        
        // Wert für first Knoten setzen
        first_Knoten.setWert(10);

        // neues Objekt in der Kette erstellen
        Knoten second_Knoten = new Knoten();

        // first Knoten mit second Knoten verlinken
        first_Knoten.setNaechster(second_Knoten);

        // Wert für second Knoten setzen
        second_Knoten.setWert(500);

        //neues Objekt in der Kette erstellen
        Knoten third_Knoten = new Knoten();

        // second Knoten mit third Knoten verlinken
        second_Knoten.setNaechster(third_Knoten);

        // Wert für third Knoten setzen
        third_Knoten.setWert(600);

        

        //checke ob vorkommt
        System.out.println(kommtVor(first_Knoten, 600));

        //drucke ganze Liste
        druckeListe(first_Knoten);

    }
}
