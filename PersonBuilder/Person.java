package PersonBuilder;

import java.util.Objects;

public class Person implements Cloneable{

    //all fields for a person
    private String firstName;
    private String lastName;
    private int age;
    private String gender;

    //private constuctor so no new Object can be created with this constructor, as we do it with the builder
    private Person(String firstName, String lastName, int age, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
    }

    //only using getters in this method and doing the setters inside the PersonBuilder class
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, age, gender);
    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
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
        if (age != other.age)
            return false;
        if (gender == null) {
            if (other.gender != null)
                return false;
        } else if (!gender.equals(other.gender))
            return false;
        return true;
    }




    //static method for calling a PersonBuilder
    public static PersonBuilder builder() {
    return new PersonBuilder();
        }

    //Using this inner class in java for building this person
    public static class PersonBuilder {
        private String firstName;
        private String lastName;
        private int age;
        private String gender;
        

        public PersonBuilder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }
    
        public PersonBuilder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }
    
        public PersonBuilder setAge(int age) {
            this.age = age;
            return this;
        }
    
        public PersonBuilder setGender(String gender) {
            this.gender = gender;
            return this;
        }
    
        public Person build() {
            return new Person(firstName, lastName, age, gender);
        }
    }
    





    
    

}
