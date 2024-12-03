package records;

public class PersonTest {

    public static void main(String[] args) {
        try {
            Person p1 = new Person("123456", "Johnny"); // This will work
            System.out.println(p1); //This will use the toString method
            System.out.println(p1.id()); //getter methods
            System.out.println(p1.name()); //getter methods

            Person p2 = new Person(" ", "Kim"); // This will throw an exception
            System.out.println(p2);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}



