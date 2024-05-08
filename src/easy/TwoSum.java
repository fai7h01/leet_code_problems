package easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {
        int[] nums = {2,0,11,7}; // length -> n
        int target = 9;
        System.out.println(Arrays.toString(twoSumBruteForce(nums, target)));
        System.out.println(Arrays.toString(twoSumHashMap(nums, target)));
        System.out.println(Arrays.toString(twoSumTwoPointer(nums, target)));
    }

    static int[] twoSumBruteForce(int[] nums, int target){ // O(n2)
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) return new int[]{i,j};
            }
        }
        return new int[]{};
    }

    static int[] twoSumHashMap(int[] nums, int target){ //O(n)
        Map<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])){
                return new int[]{i,map.get(target - nums[i])};
            }else{
                map.put(nums[i],i);
            }
        }

        return new int[]{};
    }

    static int[] twoSumTwoPointer(int[] nums, int target){ //O(nlogn)

        Arrays.sort(nums); //O(nlogn)   2,5,7,9    16
        int start = 0;
        int end = nums.length - 1;

        while(start < end){
            if (nums[start] + nums[end] == target) return new int[]{start,end}; // O(n)
            else if (nums[start] + nums[end] > target) {
                end--;
            }else {
                start++;
            }
        }
        return new int[]{};
    }

}
