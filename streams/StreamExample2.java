package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample2 {


    public static void main(String[] args) {
        

        List<Character> listWithAllLowerChars = Stream.iterate('a', x -> (char) (x + 1))
                                                      .limit(26)
                                                      .toList();

        int sumOfFirst100Numbers = Stream.iterate(1, x -> x + 1)
                        .limit(100)
                        .mapToInt(Integer::intValue)
                        .sum();
                        

        int sumOfFirst1000Numbers = IntStream.rangeClosed(1, 100).sum();


        System.out.println("Sum of first 100 numbers: " + sumOfFirst100Numbers + " | Sum of first 1000 numbers: " + sumOfFirst1000Numbers);
        System.out.println(listWithAllLowerChars);

    }
    
}
