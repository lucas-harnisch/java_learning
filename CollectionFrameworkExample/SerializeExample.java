package CollectionFrameworkExample;

public class SerializeExample {

    //adding serialized Persons to Storage

    public static void main(String[] args) {
        
        PersonStorageManager.getInstance().listPersonStorage();

        PersonStorageManager.getInstance().addPersonFromList(PersonSerializationUtil.deserializeAll("People.txt"));

        PersonStorageManager.getInstance().listPersonStorage();
    }
    
}
