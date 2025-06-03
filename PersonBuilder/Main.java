package PersonBuilder;


public class Main {

    public static void main(String[] args) {
        
        Person person1 = Person.builder()
                            .setFirstName("Max")
                            .setLastName("Mustermann")
                            .build();

        Person person2 = Person.builder()
                            .setFirstName("Max")
                            .setLastName("Mustermann")
                            .build();
                            
        

    }

}
