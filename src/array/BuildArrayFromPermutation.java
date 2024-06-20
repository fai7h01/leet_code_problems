package array;

import java.util.Arrays;

public class BuildArrayFromPermutation {

    public static void main(String[] args) {

        int[] nums = {0,2,1,5,3,4}; //0,1,2,4,5,3
        int[] ans = buildArray(nums);
        System.out.println(Arrays.toString(ans));

    }

    static int[] buildArray(int[] nums){

        int[] ans = new int[nums.length];

        int j = 0;

        for (int i = 0; i < ans.length; i++) {
            ans[i] = nums[nums[j++]];
        }
        return ans;
    }


}
