package CollectionFrameworkExample;

import java.util.ArrayList;
import java.util.List;

public class PersonStorageManager {

    

    //List for saving people
    private List<Person> personStorage;

    //Singelton pattern so only one PersonStorage is allowed
    private static PersonStorageManager manager; 


   private PersonStorageManager() {
        personStorage = new ArrayList<>();
    }


    //method for checking singelton 
    public static PersonStorageManager getInstance()  {

        if (manager == null) {
            manager = new PersonStorageManager();
        }

            return manager;
        }

    public void addPersonFromList(List<Person> persons)  {
           if (persons == null) {
                throw new IllegalArgumentException("Person cannot be null");
            }
            for (Person person : persons) {
        personStorage.add(person);}
    }


    public void addPerson(Person... persons)  {
           if (persons == null) {
                throw new IllegalArgumentException("Person cannot be null");
            }
            for (Person person : persons) {
        personStorage.add(person);}
    }



    public void listPersonStorage() {

        personStorage.forEach(System.out::println);
        
        //personStorage.forEach(x -> System.out.println(x));
    }

    public List<Person> getPersonList() {
        return personStorage;
    }


    }
    


    

