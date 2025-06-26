package LambdaExample;

import java.util.Arrays;
import java.util.List;

public class LambaStreamExample {



    public static void main(String[] args) {
        

        
     List<String> names = Arrays.asList("Anna", "Alfred", "Bernd", "Amelie", "Clara", "alex");


        names
        .stream()
        .filter(name -> name.toLowerCase().startsWith("a"))
        .map(name -> name.toUpperCase())
        .sorted()
        .forEach(System.out::println);
        


    }

}
