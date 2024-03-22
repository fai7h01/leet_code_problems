package medium;

import java.util.Arrays;

public class RotateArray {

    private static void rotate(int[] nums, int k){

        k %= nums.length;

        reverseArray(nums, 0, nums.length-1);
        reverseArray(nums, 0, k-1);
        reverseArray(nums, k, nums.length-1);
        System.out.println(Arrays.toString(nums));

    }

    private static void reverseArray(int[] arr, int start, int end){

        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

    }

    public static void main(String[] args) {

        rotate(new int[]{1,2,3,4,5,6,7}, 3);
        //               4 3 2 1 7 6 5
        //               5 6 7 1 2 3 4

    }
}
/*
Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
 */