package array;

import java.util.Arrays;

public class ConcatenationOfArray {
    public static void main(String[] args) {

        int[] nums = {1,2,1}; // 1 2 1 1 2 1
        System.out.println(Arrays.toString(getConcatenation(nums)));

    }

    static int[] getConcatenation(int[] nums){

        int[] ans = new int[nums.length * 2];

        int j = 0;

        for (int i = 0; i < nums.length; i++) {
            ans[j++] = nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
            ans[j++] = nums[i];
        }

        return ans;
    }
}
