package src;

public class a2 {

        
        
            public static void main (String[] args) {
            rek(4);
            }
            public static void rek(int z) {
            z--;
            System.out.println(z);
            if (z!=0)
            rek(z);

            // wird erst aufgerufen, wenn die Rekursion vorbei ist
            //System.out.println(z);
            }
            }

