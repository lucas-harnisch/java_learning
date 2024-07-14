package src.Klausur;
class Knoten {

    // Instanzvariablen
    private int wert;
    private Knoten naechster;

    // Konstruktor
    Knoten(int w, Knoten n) {
        setWert(w);
        setNaechster(n);
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




    public static void main(String[] args) {
        // Beispiel zur Verwendung der Knoten-Klasse
        Knoten knoten3 = new Knoten(3, null);
        Knoten knoten2 = new Knoten(2, knoten3);
        Knoten knoten1 = new Knoten(1, knoten2);

        // Zugriff auf den Wert und den nächsten Knoten
        System.out.println("Wert von knoten1: " + knoten1.getWert());
        System.out.println("Wert von knoten2: " + knoten1.getNaechster().getWert());
        System.out.println("Wert von knoten3: " + knoten1.getNaechster().getNaechster().getWert());
    }
}
