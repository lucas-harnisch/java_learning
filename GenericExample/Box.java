package GenericExample;

public class Box<T extends Comparable<T>> implements Comparable<Box<T>>{

    private T value;

    public Box() {
        this.value = value;
    }
    
    //set value via set method
    public void setValue(T value) {
        this.value = value;
    }

    //get value
    public T getValue() {
        return this.value;
    }

    
    @Override
    public int compareTo(Box<T> other) {
        if (this.value == null && other.value == null) return 0;
        if (this.value == null) return -1;
        if (other.value == null) return 1;

        return this.value.compareTo(other.value);
    }
}
