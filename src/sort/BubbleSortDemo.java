package src.sort;

import java.util.ArrayList;
import java.util.Random;

//A Bubble Sort for ArrayList <Integer>

public class BubbleSortDemo {


    public static void main(String[] args) {
        
        //create new Array List
        ArrayList<Integer> toSort = new ArrayList<>();

        //adding 10x Random Numbers
        for (int i = 0; i < 8; i++) {

        // Random Instanz
        Random generator = new Random();
        int randomNumber = generator.nextInt(100); //random nummber 0-100

        //Hinzufügen zur ArrayList
        toSort.add(randomNumber);


        }
        //unsorted List
        System.out.println("Unsorted:" + toSort);
        //sorted List
        System.out.println("Sorted:" + bubleSort(toSort));
    }


    public static ArrayList<Integer> bubleSort(ArrayList<Integer> toSort) {

        for (int i = 0; i < toSort.size(); i++) { // get over the array till everything is sorted
            for (int j = 0; j < toSort.size()  -1 ; j++) { //compare the numbers, if true make a change

                
                if (toSort.get(j) > toSort.get(j + 1)) {
                    // change
                    int temp = toSort.get(j);
                    toSort.set(j, toSort.get(j + 1));
                    toSort.set(j + 1, temp);
                    System.out.println(toSort);
                }
            }
        }

        return toSort; // return sorted List
    }

    
    }

    


