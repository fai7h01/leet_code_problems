package array.medium;

import java.util.Arrays;

public class MaximumNumberOfCoinsYouCanGet {

    public static void main(String[] args) {

        int[] piles = {9,8,7,6,5,1,2,3,4};
        System.out.println(maxCoins(piles));

    }

    static int maxCoins(int[] piles){

        Arrays.sort(piles);

        int myCoins = 0;

        int k = piles.length - 2;

        for (int i = 0; i < piles.length / 3; i++) {
            myCoins += piles[k];
            k-=2;
        }
        return myCoins;


    }


}
