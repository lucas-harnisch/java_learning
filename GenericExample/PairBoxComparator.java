package GenericExample;

import java.util.Comparator;

public class PairBoxComparator<T, V> implements Comparator<PairBox<T, V>> {



            public int compare(PairBox<T, V> box1, PairBox<T, V> box2) {
        try {
            //for comparing first field
            Integer int1 = (Integer)box1.getFirst();
            Integer int2 = (Integer)box2.getFirst();
            Integer result = Integer.compare(int1, int2);


            //if first field is equal, compare to String
            if(result == 0) {
            String str1 = (String)box1.getSecond();
            String str2 = (String)box2.getSecond();
            result = str1.compareTo(str2);

            }
            
            return result;
        }
         catch (NumberFormatException e) {
            throw new IllegalArgumentException("First fields must be parseable as integers.");
        }


    }
}

