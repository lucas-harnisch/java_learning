package CollectionFrameworkExample;

import java.io.Serializable;
import java.time.LocalDate;

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
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
        result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
        result = prime * result + ((birthday == null) ? 0 : birthday.hashCode());
        result = prime * result + ((phoneNumber == null) ? 0 : phoneNumber.hashCode());
        result = prime * result + ((email == null) ? 0 : email.hashCode());
        result = prime * result + ((address == null) ? 0 : address.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Person other = (Person) obj;
        if (firstName == null) {
            if (other.firstName != null)
                return false;
        } else if (!firstName.equals(other.firstName))
            return false;
        if (lastName == null) {
            if (other.lastName != null)
                return false;
        } else if (!lastName.equals(other.lastName))
            return false;
        if (birthday == null) {
            if (other.birthday != null)
                return false;
        } else if (!birthday.equals(other.birthday))
            return false;
        if (phoneNumber == null) {
            if (other.phoneNumber != null)
                return false;
        } else if (!phoneNumber.equals(other.phoneNumber))
            return false;
        if (email == null) {
            if (other.email != null)
                return false;
        } else if (!email.equals(other.email))
            return false;
        if (address == null) {
            if (other.address != null)
                return false;
        } else if (!address.equals(other.address))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Person [firstName=" + firstName + ", lastName=" + lastName + ", birthday=" + birthday + ", phoneNumber="
                + phoneNumber + ", email=" + email + ", address=" + address + "]";
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
