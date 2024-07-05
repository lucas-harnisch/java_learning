package src.arraylist;

import java.util.ArrayList;

import src.annotation.author;

@author(name = "Lucas Harnisch") 
public class arrayList {


    public static void main(String[] args) {
        
    
    // creates new array List
    ArrayList<String> arrayList = new ArrayList<>();


    //adding Items to the list
    arrayList.add("Banana");
    arrayList.add("Apple");
    arrayList.add("Cherry");


  


    //check if something is existing
    boolean exist = arrayList.contains("Banana");
    System.out.println(exist);


    //saving length of the ArrayList in int

    int length = arrayList.size();
    System.out.println(length);



    
    }

    
    // own method for returninig the size
    public static int getSize(ArrayList<String> list) {


        return list.size();

    }


}
    