package InputOutputExample;

public class Main {

    public static void main(String[] args) {
        FileOutputWriter.write("Test.txt", "A B C");
        FileInputReader.reverseRead("Test.txt");
    }
    
}
