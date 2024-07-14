package src.recursion;


public class recursionTask {

public static void main(String[] args) {
        
rek(4);        


System.out.println("");



int w = f(2,3);

System.out.println(w);

    }

    static int f(int z, int x){
        System.out.println(z + " " + x);

        if (z == x) {
            return 1;
        }
        if (z == 0) {
            return 1;
        }
return  f(z, x-1) + f(z-1,x-1);
   

}
    
public static void rek(int z) {
    z--;
    System.out.println(z);
    if (z != 0) {
        rek(z);
    }
    System.out.println(z);
    
}


}
