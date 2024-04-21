package easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {

        System.out.println(majorityElement(new int[]{3,2,3}));

    }

    private static int majorityElement(int[] nums){

        //time complexity 0(n)
        //space complexity O(n)

        Map<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i],map.getOrDefault(nums[i], 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > nums.length/2){
                return entry.getKey();
            }
        }
        return 0;

    }

    private static int majorityElement2(int[] nums){

        Arrays.sort(nums);
        int length = nums.length;
        return nums[length/2];

    }

}
