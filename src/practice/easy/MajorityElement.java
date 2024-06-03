package practice.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        System.out.println(majorityWithSort(new int[]{2,2,1,1,1,2,2}));
        System.out.println(majorityWithMap(new int[]{2,2,1,1,1,2,2}));
        System.out.println(majorityWithMap(new int[]{3,2,3}));
        System.out.println(majorityElement(new int[]{2,2,1,1,1,2,2}));
    }

    static int majorityWithSort(int[] nums){
        Arrays.sort(nums);
        return nums[nums.length/2]; // majority element always appears in middle if array is sorted
    }

    static int majorityWithMap(int[] nums){

        Map<Integer,Integer> frequencyMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            frequencyMap.put(nums[i],frequencyMap.getOrDefault(nums[i],0) + 1);
        }

        for (Map.Entry<Integer, Integer> eachEntry : frequencyMap.entrySet()) {
            if (eachEntry.getValue() > nums.length/2){
                return eachEntry.getKey();
            }
        }
        return -1;

    }

    static int majorityElement(int[] nums){

        int count = 0;
        int candidate = 0;

        for (int num : nums) {
            if (count == 0){
                candidate = num;
            }
            if (num == candidate){
                count++;
            }else{
                count--;
            }
        }
        return candidate;
    }

}
