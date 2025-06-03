package SortAlgorithm;

public class SimpleBubbleSort {

    public static void bubblesort(int[] int_array) {
        
        for (int i = 0; i < int_array.length; i++) {
            for (int j = 0; j < int_array.length -1; j++) {
                if (int_array[j] > int_array[j + 1]) {

                    int temp = int_array[j];
                    int_array[j] = int_array[j +1];
                    int_array[j + 1] = temp;




                }
            }

            
        }
}
}
