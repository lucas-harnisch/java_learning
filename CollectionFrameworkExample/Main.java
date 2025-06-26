package CollectionFrameworkExample;


import java.time.LocalDate;
import java.util.Collections;
import java.util.Objects;

import LambdaExample.PersonComparator;


public class Main {

    public static void main(String[] args) {
        
        //create PersonStorage
        PersonStorageManager.getInstance();

        //print PersonStorage before
        PersonStorageManager.getInstance().listPersonStorage();


        //create a Person and save it inside the List
        Person lucas = new Person.PersonBuilder()
                                        .requiredFileds("Lucas", "Harnisch", LocalDate.of(2001, 8, 4))
                                        .build();



        //create a Person and save it inside the List
        Person eli = new Person.PersonBuilder()
                                        .requiredFileds("Elisabeth", "Hehl", LocalDate.of(2003, 5, 3))
                                        .build();

        Person dummy = new Person.PersonBuilder()
                                        .requiredFileds("Dummy", "Person", LocalDate.of(1990, 1, 1))
                                        .phoneNumber("0987654321")
                                        .email("mail@example.com")
                                        .build();

        //adding Person
        PersonStorageManager.getInstance().addPerson(lucas, eli, dummy);

        //print PersonStorage afterwards
        PersonStorageManager.getInstance().listPersonStorage();

        Collections.sort(PersonStorageManager.getInstance().getPersonList(), new PersonCamparator());

        System.out.println();

        //print PersonStorage afterwards
        PersonStorageManager.getInstance().listPersonStorage();



    }
    
    
}
