package easy;

import java.util.Arrays;

public class RemoveElement {

    public static void main(String[] args) {

        System.out.println(removeElement(new int[]{3, 2, 2, 3}, 3));
        System.out.println(removeElementUsingTemp(new int[]{3, 2, 2, 3}, 3));

    }


    private static int removeElement(int[] nums, int val){

        // time complexity :  On
        // space complexity : O(1)

        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val){
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }

    private static int removeElementUsingTemp(int nums[], int val){

        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val){
                int temp = nums[index];
                nums[index] = nums[i];
                nums[i] = temp;
                index++;
            }
        }
        System.out.println(Arrays.toString(nums));
        return index;
    }

}
