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
                            

                                
        System.out.println(person1.hashCode());
        System.out.println(person2.hashCode());
        System.out.println(person1.equals(person2));

    }

}
