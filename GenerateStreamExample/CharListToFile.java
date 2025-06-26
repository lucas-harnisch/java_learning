package GenerateStreamExample;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CharListToFile {

    public static void main(String[] args) {



        List<Character> upperCharacterList = IntStream.rangeClosed('A', 'Z')
                                                      .mapToObj(c -> (char) c)
                                                      .toList();


        List<Character> lowerCharacterList = Stream.iterate('a', x -> (char) (x +1))
                                                   .limit(26)
                                                   .toList();


        try (BufferedWriter writer = new BufferedWriter(new FileWriter("/home/lucas/Downloads/A-Z.txt"))) {

            upperCharacterList.forEach(x -> {
                try {
                    writer.write(x + " ");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });

            writer.newLine();

            lowerCharacterList.forEach(x -> {
                try {
                    writer.write(x + " ");
                }
                catch(IOException e) {
                    e.printStackTrace();
                }
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}