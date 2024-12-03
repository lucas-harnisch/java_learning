package src.Klausur.Klausur2;

public class Bruch {

    // Instanzvariablen
    long zaehler;
    long nenner;

    //Konstruktoren
    Bruch(long zaehler, long nenner){

        this.zaehler = zaehler  ; // Verdeutlichung Unterschied zwischen Instanzvariablen und lokalen Variablen
        this.nenner = nenner;
        

    }
    
    Bruch(long zaehler) {

        this.zaehler = zaehler;

    }
    // Getter
    public long getZaehler() {

        return zaehler;

    }

    public long getNenner() {

    
        return nenner;
    }

    // Setter
    public void setZaehler(long zaehler) {

        this.zaehler = zaehler;
 
    }

    public void setNenner (long nenner) {

        this.nenner = nenner;
  
    }




    // Methode für den GGT
    static int ggt(int a, int b) {

        if (b == 0)
            {return a;}
        return ggt(a, a%b);    
    }

    // Methode für neuen Bruch
    public Bruch add(Bruch other) {
        long neuerZaehler = this.zaehler * other.nenner + other.zaehler * this.nenner;
        long neuerNenner = this.nenner * other.nenner;
        return new Bruch(neuerZaehler, neuerNenner);
    }
    
    }
    

    

