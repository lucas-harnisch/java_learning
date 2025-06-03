package CollectionFrameworkExample;

import java.util.Comparator;

class PersonCamparator implements Comparator<Person> {

    @Override
    public int compare(Person person1, Person person2) {
        
        if (person1.getBirthday().isEqual(person2.getBirthday())){
            return 0;}
    
        if (person1.getBirthday().isBefore(person2.getBirthday())) {
            return -1;}

        else {
            return 1;
        }
    } }