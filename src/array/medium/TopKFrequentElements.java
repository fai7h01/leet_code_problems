package array.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopKFrequentElements {

    public static void main(String[] args) {

    }

    static int[] topKFrequent(int[] nums, int k){

        Map<Integer,Integer> count = new HashMap<>();
        List<Integer>[] freq = new ArrayList[nums.length + 1];

        for (int num : nums) {
            count.put(num, count.getOrDefault(nums, 0) + 1);
        }


        for (int i = 0; i < freq.length; i++) {
            freq[i] = new ArrayList<>();
        }

        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            freq[entry.getValue()].add(entry.getKey());
        }

        int[] result = new int[k];
        int i = 0;
        for (int j = freq.length - 1; j >= 0; j--) {
            for (Integer num : freq[j]) {
                result[i++] = num;
                if (i == k){
                    return result;
                }
            }
        }
        return result;
    }

}
