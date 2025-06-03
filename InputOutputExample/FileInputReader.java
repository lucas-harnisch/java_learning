package InputOutputExample;

import java.io.FileReader;
import java.io.IOException;


public class FileInputReader {

    public static void read(String fileName) {
        try  {
            FileReader reader = new FileReader(fileName);
            int character;
            while ((character = reader.read()) != -1) {
             
                System.out.print((char) character);
            }
            System.out.println(); 
            reader.close();
        } catch (IOException e) {
            System.err.println("Fehler beim Lesen der Datei: " + fileName);
            e.printStackTrace();
        }
    }


    
    public static void reverseRead(String filename) {
        try  {
        FileReader reader = new FileReader(filename);
        StringBuilder builder = new StringBuilder();
        int character;

        while ((character = reader.read()) != -1) {
            builder.append((char) character);
        }
        
        String reverseOutput = builder.reverse().toString();
        reader.close();
        System.out.println(reverseOutput);
        

        } catch (IOException e) {
            e.getStackTrace();
        }
        
    }
}
