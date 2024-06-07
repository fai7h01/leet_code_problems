package easy;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate2 {
    public static void main(String[] args) {

        System.out.println(contains(new int[]{1,0,1,1}, 1));

    }

    static boolean contains(int[] nums, int k){
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (i > k){
                set.remove(nums[i-k-1]);
            }
            if (set.contains(nums[i])) return true;
            set.add(nums[i]);
        }
        return false;
    }

}
