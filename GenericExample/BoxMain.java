package GenericExample;

public class BoxMain {

    public static void main(String[] args) {
        

        Box<Integer> singleBox = new Box<>();
        singleBox.setValue(10);

        System.out.println(singleBox.getValue());

        singleBox.setValue(19);
        System.out.println(singleBox.getValue());

    }
    
}
