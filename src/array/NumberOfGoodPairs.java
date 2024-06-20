package array;

public class NumberOfGoodPairs {

    public static void main(String[] args) {
        int[] nums = {1,1,1,1};
        System.out.println(numIdenticalPairs(nums));
    }

    static int numIdenticalPairs(int[] nums) {

        int countPairs = 0;

        int i = 0;
        int j = 1;

        while(j < nums.length){

            if (nums[i] == nums[j++]) countPairs++;
            if (j > nums.length - 1){
                i += 1;
                j = i + 1;
            }

        }

        return countPairs;
    }

}
