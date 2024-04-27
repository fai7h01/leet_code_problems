package test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    public static void main(String[] args) {
        System.out.println(majorityElement2(new int[]{2,2,1,1,1,2,2}));
    }

    static int majorityElement(int[] nums){

        Arrays.sort(nums);
        return nums[nums.length/2];

    }

    static int majorityElement2(int[] nums){
        Map<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        for (Map.Entry<Integer, Integer> eachEntry : map.entrySet()) {
            if (eachEntry.getValue() > nums.length/2){
                return eachEntry.getKey();
            }
        }
        return 0;
    }

}
