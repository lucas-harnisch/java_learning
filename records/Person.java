package records;

// A record is a special type of class in Java.
// It creates a fully integrated DTO class with a valid constructor and a toString() method out of the box.
// It saves a ton of boilerplate code for DTOs (Data Transfer Objects).
// It is enough to just declare the fields after the record declaration.
// The data in records is immutable (cannot be changed).
// The following methods are automatically created: constructor, toString(), hashCode(), equals(), and getter methods.
// You can also add something called a "compact constructor" for validation.

// Record declaration
public record Person(String id, String name) {

    // Compact constructor for validation
    public Person {
        if (id == null || id.isBlank()) {
            throw new IllegalArgumentException("ID cannot be empty!");
        }
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be empty!");
        }
    }
}
