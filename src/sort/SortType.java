package src.sort;

import java.util.List;

public class SortType {

    // Bubble Sort Algorithmus
    public static <T extends Comparable<T>> void bubbleSort(List<T> list) {
        int n = list.size();
        for (int i = 0; i < n - 1; i++) {
            // Vergleiche benachbarte Elemente und tausche sie bei Bedarf
            for (int j = 0; j < n - i - 1; j++) {
                if (list.get(j).compareTo(list.get(j + 1)) > 0) {
                    // Tausche die Elemente
                    swap(list, j, j + 1);
                }
            }
        }
    }

    // Selection Sort Algorithmus
    public static <T extends Comparable<T>> void selectionSort(List<T> list) {
        int n = list.size();
        for (int i = 0; i < n - 1; i++) {
            // Suche das kleinste Element im unsortierten Teil der Liste
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (list.get(j).compareTo(list.get(minIndex)) < 0) {
                    minIndex = j;
                }
            }
            // Tausche das kleinste Element mit dem aktuellen Element
            swap(list, i, minIndex);
        }
    }

    // Insertion Sort Algorithmus
    public static <T extends Comparable<T>> void insertionSort(List<T> list) {
        int n = list.size();
        for (int i = 1; i < n; i++) {
            T key = list.get(i);
            int j = i - 1;

            // Verschiebe Elemente, die größer als key sind, nach rechts
            while (j >= 0 && list.get(j).compareTo(key) > 0) {
                list.set(j + 1, list.get(j));
                j--;
            }
            // Setze das key-Element an die richtige Position
            list.set(j + 1, key);
        }
    }

    // Hilfsmethode zum Tauschen von zwei Elementen in der Liste
    private static <T> void swap(List<T> list, int i, int j) {
        T temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }
}
