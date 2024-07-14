package src.Klausur;

public class Preis{
    double p;
    Preis (double neuP) {
    p = neuP;
    }


    double bruttoPreis() {
    return p + p * 0.16;
    }


    public static double sum(Preis[] a) {
    int i = 1;
    double r = 0.0;
    while (i < a.length) {
    r = r + a[i].p;
    }
    return r;
    }
    }