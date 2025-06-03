package CollectionFrameworkExample;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class PersonSerializationUtil {

    public static void serialize(String fileName, Person... persons) {
    try (FileOutputStream fos = new FileOutputStream(fileName);
         ObjectOutputStream oos = new ObjectOutputStream(fos)) {

        for (Person person : persons) {
            oos.writeObject(person);
            System.out.println("The Person was copied successfully to file: " + fileName);
        }

    } catch (FileNotFoundException fnfe) {
        fnfe.printStackTrace();
        System.out.println("The Person was not copied successfully!");
    } catch (IOException ioe) {
        ioe.printStackTrace();
        System.out.println("The Person was not copied successfully!");
    }
}

    

public static List<Person> deserializeAll(String fileName) {
    List<Person> persons = new ArrayList<>();

    try (FileInputStream fis = new FileInputStream(fileName);
         ObjectInputStream ois = new ObjectInputStream(fis)) {

        while (true) {
            try {
                Object obj = ois.readObject();
                if (obj instanceof Person) {
                    persons.add((Person) obj);
                }
            } catch (EOFException eof) {
                break;
            }
        }

    } catch (IOException | ClassNotFoundException e) {
        e.printStackTrace();
    }

    return persons;
}



}


