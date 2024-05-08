package easy;

import java.util.Arrays;

public class MergeSortedArray {

    public static void main(String[] args) {

        merge(new int[]{1,2,3,0,0,0},3,new int[]{2,5,6},3);

    }

//                           1,2,3,0,0,0    3       2,5,6        3
    private static void merge(int[] nums1, int m, int[] nums2, int n){
        // nums1.length = m + n

        // time complexity : O(m+n)Log(m+n) --> O n log n
        // space complexity : O(1)

        for (int i = 0, j = m; i < n; i++) {
            nums1[j] = nums2[i];
            j++;
        }
        Arrays.sort(nums1);
        System.out.println(Arrays.toString(nums1));

    }

    private static void mergeTwoPointerSolution(int[] nums1, int m, int[] nums2, int n){

        // time complexity : O(m+n) --> On O(n) + O(m) -> O(n)
        // space complexity : O(1)

        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while(j >= 0){
            if (i >= 0 && nums1[i] > nums2[j]){
                nums1[k--] = nums1[i--];
            }else{
                nums1[k--] = nums2[j--];
            }
        }


        System.out.println(Arrays.toString(nums1));

    }

}
