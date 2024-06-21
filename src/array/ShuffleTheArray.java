package array;

import java.util.Arrays;

public class ShuffleTheArray {

    public static void main(String[] args) {

        int[] nums = {2,5,1,3,4,7};
        System.out.println(Arrays.toString(shuffle(nums,3)));

    }


    static int[] shuffle(int[] nums, int n){

        int firstHalf = 0;
        int secondHalf = n;

        int[] ans = new int[n * 2];

        int i = 0;
        int j = 1;

        while(firstHalf < n && secondHalf < n * 2){

            ans[i] = nums[firstHalf++];
            ans[j] = nums[secondHalf++];

            i+=2;
            j+=2;
        }

        return ans;
    }

}
