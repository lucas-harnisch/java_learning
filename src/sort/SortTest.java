package src.sort;

import java.util.ArrayList;

public class SortTest {
 public static void main(String[] args) {
//get random list from generator
ArrayList<Integer> numberList = Generator.numberGenerator(2000);
//unsorted
System.out.println(numberList);

//sort
SortType.bubbleSort(numberList);
//sorted with bubble Sort
System.out.println(numberList);
}
}