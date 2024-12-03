package src.sort;

import java.util.ArrayList;
import java.util.Random;

public class SelectionSortDemo {



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
        //System.out.println("Sorted:" + selectionSort(toSort));
    }    

/*
    public static ArrayList<Integer> selectionSort (ArrayList<Integer> toSort) {





    } */




}
