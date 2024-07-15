package src.Klausur.Klausur2;

import src.annotation.author;

// Aufgabe 5 in Beispielklausur 2 für PR1 SoSe2024 

@author(name = "Lucas Harnisch")
public class A5{
    double p;
    A5 (double neuP) {
    p = neuP;
    }


    double bruttoPreis() {
    return p + p * 0.16;
    }


    public static double sum(A5[] a) {
    int i = 1;
    double r = 0.0;
    while (i < a.length) {
    r = r + a[i].p;
    }
    return r;
    }
    }