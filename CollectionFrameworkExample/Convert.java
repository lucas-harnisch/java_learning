package CollectionFrameworkExample;


import java.util.*;


public class Convert {




    public static void main(String[] args) {

        //example List

        List<Integer> integerList1 = Arrays.asList(328432, 218213, 2134, 1241, 42124, 421434, 1,1 );
        List<String> stringList1 = new ArrayList<>();
        stringList1.add("Merkur");
        stringList1.add("Venus");
        stringList1.add("Erde");
        stringList1.add("Mars");
        stringList1.add("Jupiter");
        stringList1.add("Saturn");
        stringList1.add("Uranus");


        //example ma

        Map<Integer, String> integerStringMap1 = Map.of(
            1,"Lisa", 
            2, "Lucas",
            3, "John"
        );

//##############################################################List Operation sector##############################################################

        System.out.println(integerList1.getClass());

        //removing duplicates with convertion set
        Set <Integer> integerList1WithoutDuplicates = new HashSet<>(integerList1);

        System.out.println(integerList1WithoutDuplicates);


        //now sorting with TreeSet

        Set<Integer> integerList1WithoutDuplicatesNaturalOrder = new TreeSet<>(integerList1WithoutDuplicates);

        System.out.println(integerList1WithoutDuplicatesNaturalOrder);



//##############################################################Map Operation Sector##############################################################


    
}
}