package medium;

import java.util.*;

public class KthLargestElementInArray {
    public static void main(String[] args) {

        int[] nums = {3,2,3,1,2,4,5,5,6};

        System.out.println(findKthLargest(nums,4));
    }

    public static int findKthLargest(int[] nums, int k) {

        Queue<Integer> queue = new PriorityQueue<>();

        for (int num : nums) {
            queue.add(num);
            if (queue.size() > k) queue.poll();
        }
        return queue.peek();

    }
}

