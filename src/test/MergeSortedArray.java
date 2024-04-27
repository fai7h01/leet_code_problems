package test;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(merge(new int[]{1,2,3,0,0,0}, 3, new int[]{2,5,6}, 3)));

    }

    static int[] merge(int[] nums1, int m, int[] nums2, int n){

        int k = m - 1;
        int j = n - 1;
        int l = m + n - 1;

        while(j >= 0){
            if (k >= 0 && nums1[k] > nums2[j]){
                nums1[l--] = nums1[k--];
            }else{
                nums1[l--] = nums2[j--];
            }
        }

        return nums1;
    }


}
