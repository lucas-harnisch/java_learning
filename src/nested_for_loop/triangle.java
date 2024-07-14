package src.nested_for_loop;



public class triangle {

    

public static void main (String[] args){
    create_triangle(4);
    
}

static void create_triangle(int n){
    for (int i = 1; i <= n; i++){ // äußere Schleife für Zeilen
        for (int j = 1; j <= i; j++){ // innere Schleife für Spalten
            System.out.print(i + " "); // Ausgabe der Zahl i gefolgt von einem Leerzeichen
        }
    System.out.println();
    }
}
}
