package GenericExample;

class PairBox<T, V> {

    private T field1;
    private V field2;

    public PairBox(T field1, V field2) {
        this.field1 = field1;
        this.field2 = field2;
    }

    public T getFirst() {
        return field1;
    }

    public V getSecond() {
        return field2;
    }

    public static <T, V> PairBox<V, T> swap(PairBox<T, V> box) {
        return new PairBox<>(box.getSecond(), box.getFirst());
    }

    @Override
    public String toString() {
        return "PairBox (field1=" + field1 + ", field2=" + field2 + ")";
    }
}
