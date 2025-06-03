package testing;

import simple_sort.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SimpleSelectionSortTest {

    @Test
    public void testSelectionSort() {
        int[] input = {5, 3, 8, 4, 2};
        int[] expected = {2, 3, 4, 5, 8};

        SimpleBubbleSort.bubblesort(input);  // Aufruf der zu testenden Methode

        // Verifizieren, dass das Ergebnis mit dem erwarteten Array übereinstimmt
        assertArrayEquals(expected, input, "Das Array sollte korrekt sortiert werden.");
    }

    @Test
    public void testEmptyArray() {
        int[] input = {};
        int[] expected = {};

        SimpleBubbleSort.bubblesort(input);

        assertArrayEquals(expected, input, "Ein leeres Array sollte unverändert bleiben.");
    }

    @Test
    public void testSingleElementArray() {
        int[] input = {42};
        int[] expected = {42};

        SimpleBubbleSort.bubblesort(input);

        assertArrayEquals(expected, input, "Ein Array mit einem Element sollte unverändert bleiben.");
    }

    @Test
    public void testAlreadySortedArray() {
        int[] input = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};

        SimpleBubbleSort.bubblesort(input);

        assertArrayEquals(expected, input, "Ein bereits sortiertes Array sollte unverändert bleiben.");
    }

    @Test
    public void testReverseSortedArray() {
        int[] input = {9, 7, 5, 3, 1};
        int[] expected = {1, 3, 5, 7, 9};

        SimpleBubbleSort.bubblesort(input);

        assertArrayEquals(expected, input, "Ein umgekehrt sortiertes Array sollte korrekt sortiert werden.");
    }
}

