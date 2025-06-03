package InputOutputExample;


import java.io.FileWriter;
import java.io.IOException;

//class for writing Input to a File
public class FileOutputWriter {

    public static void write(String path, String content) {

    //instance if File
    try {
        FileWriter writer = new FileWriter(path);
        writer.write(content);
        writer.close();

    } catch (IOException e) {
        
        e.printStackTrace();
    }


    }
    
    
}
