package src.recursion;

import src.annotation.author;

// a simple aexample of an greedy_recursion

@author(name = "Lucas Harnisch")
public class greedy_recursion {
    public static void main(String[] args) {
        get_cent_coins(1000);
    }




    public static void get_cent_coins(int value) {
        int[] cent_coins = {50, 20, 10, 5, 2, 1};
        int i = 0; // Start with the smallest coin denomination

        while (value > 0 && i < cent_coins.length) {
            if (cent_coins[i] <= value) {
                System.out.print(cent_coins[i] + " Cent ");
                get_cent_coins(value -= cent_coins[i]); // Deduct the coin value from the total
            } else {
                i++; // Move to the next larger coin denomination
            }
        }
    }
}


    




