package LambdaExample;

import java.util.Comparator;

public class PersonComparator implements Comparator<Person>{

    @Override
    public int compare(Person arg0, Person arg1) {
        
        Person a = (Person) arg0;
        Person b = (Person) arg1;

        if (a.getAge() < b.getAge()) return -1;
        if (a.getAge() > b.getAge()) return 1;

        if (a.getName().charAt(0) > b.getName().charAt(0)) return -1;
        if (a.getName().charAt(0) < b.getName().charAt(0)) return 1;

       return 0; 

    }


    
}
