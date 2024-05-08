package test;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(merge(new int[]{1,2,3,0,0,0}, 3, new int[]{2,5,6}, 3)));

    }

    static int[] merge(int[] nums1, int m, int[] nums2, int n){

        // m = 3
        // size -> m + n = nums1.length              n = 3
        // 1,2,2,3,5,6                 2,5,6
        int lastNonZeroElementIndexInNums1 = m - 1;
        int lastIndextInNums2 = n - 1;
        int lastIndexOfNums1 = m + n - 1;

        while(lastIndextInNums2 >= 0){
            if (lastNonZeroElementIndexInNums1 >= 0 && nums1[lastNonZeroElementIndexInNums1] < nums2[lastIndextInNums2]){
                nums1[lastIndexOfNums1] = nums2[lastIndextInNums2];
                lastIndexOfNums1--;
                lastIndextInNums2--;
            }else{
                nums1[lastIndexOfNums1] = nums1[lastNonZeroElementIndexInNums1];
                lastIndexOfNums1--;
                lastNonZeroElementIndexInNums1--;
            }
            System.out.println(Arrays.toString(nums1));
        }
        return nums1;

    }


}
