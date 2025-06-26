package GenericExample;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

class PairBoxTest {

    public static void main(String[] args) {
        

        List<PairBox<Integer,String>> pairBoxList = List.of(

                new PairBox<>(999, "Not Empty...."),
                new PairBox<>(999, "Empty...."),
                new PairBox<>(434, "This is another mystery box!"),
                new PairBox<>(434, "False"),
                new PairBox<>(1, "This should be the first Item in the list!")

                
                );


                //list before sort 
                pairBoxList.stream()
                           .forEach(System.out::println);

                //new line for style purpose
                System.out.println();

                //list after sort
                pairBoxList.stream()
                .sorted(new PairBoxComparator<Integer, String>())
                .forEach(System.out::println);

                                              

            Set<PairBox <Integer,String>> sortedPairBoxList = new TreeSet<>(pairBoxList);

            System.out.println();

            for (PairBox pairBox : sortedPairBoxList)  {
                System.out.println(pairBox);
            }



    }


}