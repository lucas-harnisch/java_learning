package expressions;

public class expressions {


    public static void main(String[] args) {
        
        int i;
        int e = 1;
        double d = 1;
        double f = 1;

        for (i=1;i<10;i++) {


            if (i%2 == 0) 
                System.out.println(d = d - 1.0 / i);
            else
                System.out.println(d = d + 1.0 / i);    


    }

    System.out.println("");

    do {
        if (e%2 == 0) {
            System.out.println(f = f - 1.0 / e);
        }
        else {
            System.out.println(f = f + 1.0 / e); 
        }
        e++;
    } while (e<10);
    
}
}