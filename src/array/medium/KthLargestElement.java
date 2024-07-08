package array.medium;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class KthLargestElement {

    public static void main(String[] args) {

        int[] nums = {3,2,1,5,6,4};
        int k = 2;
        System.out.println(kthLargest(nums,k));

    }


    static int kthLargest(int[] nums, int k){

        Queue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());

        for (int num : nums) {
            maxHeap.add(num);
        }

        for (int i = 0; i < k - 1; i++) {
            maxHeap.poll();
        }

        return maxHeap.peek();
    }

}
