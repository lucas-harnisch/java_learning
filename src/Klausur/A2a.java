package src.Klausur;

public class A2a {

    public static void main(String[] args) {
        
        int a = 2;
        int b = 20;
        int i = 0;

        System.out.println();
        System.out.println("Value before loop: ");
        System.out.println("Value of a: " + a);
        System.out.println("Value of b: " + b +"\n");


        while (a < b) {

            a = (a - 1) * a + 1;
            b = b-1;

            System.out.println("Loop: " + i);
            System.out.println("Value of a: " + a);
            System.out.println("Value of b: " + b +"\n");    

            i++;
        }


        System.out.println("Final values: ");
        System.out.println("a = " + a);
        System.out.println("b = "+ b);
 

        
    }
    
}
