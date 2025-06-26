package CollectionFrameworkExample;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;


//making class serializable
public class Person implements Serializable{

    //required fileds for a person (final if possible) 
    private final String firstName;
    private final String lastName;
    private final LocalDate birthday;

    //fileds that are optional
    private String phoneNumber;
    private String email;
    private String address;



    //private constructor, as the builder class manages building a Person
    private Person(PersonBuilder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.birthday = builder.birthday;
        this.phoneNumber = builder.phoneNumber;
        this.email = builder.email;
        this.address = builder.address;
    }


    @Override
    public String toString() {
        return "Person [firstName=" + firstName + ", lastName=" + lastName + ", birthday=" + birthday + ", phoneNumber="
                + phoneNumber + ", email=" + email + ", address=" + address + "]";
    }


    public int hashCode() {
           return Objects.hash(this);
    }


    public static class PersonBuilder {
    //required fileds for a person (final if possible) 
    private  String firstName;
    private  String lastName;
    private  LocalDate birthday;

    //fileds that are optional
    private String phoneNumber;
    private String email;
    private String address;

    

        public PersonBuilder requiredFileds(String firstName, String lastName, LocalDate birthday) {
            //make fileds required
            if (firstName == null || lastName == null || birthday == null) {
                throw new IllegalArgumentException("Arguments cannot be null");
            }
            this.firstName = firstName;
            this.lastName = lastName;
            this.birthday = birthday;
            return this;
        }

        public PersonBuilder phoneNumber(String phoneNumber) {
            //if required fields are not set
            if (firstName == null || lastName == null || birthday == null) {
                throw new IllegalArgumentException("firstName lastName and birthday is required");
            }
            this.phoneNumber = phoneNumber;
            return this;
        }


        public PersonBuilder email(String email) {
            //if required fields are not set
            if (firstName == null || lastName == null || birthday == null) {
                throw new IllegalArgumentException("firstName lastName and birthday is required");
            }
            this.email = email;
            return this;
        }

        public PersonBuilder address(String address) {
            //if required fields are not set
            if (firstName == null || lastName == null || birthday == null) {
                throw new IllegalArgumentException("firstName lastName and birthday is required");
            }
            this.address = address;
            return this;
        }




        public Person build() {
            //if required fields are not set
            if (firstName == null || lastName == null || birthday == null) {
                throw new IllegalArgumentException("firstName lastName and birthday is required");
            }
            return new Person(this);
        }


    }

    //get Bithday
    public LocalDate getBirthday() {
        return this.birthday;
    }







    






    

}
