package test;

public class RemoveDuplicatesFromSortedArray2 {
    public static void main(String[] args) {

        int[] nums = {0,0,1,1,1,1,2,3,3};
        System.out.println(removeDuplicates(nums));


    }

    public static int removeDuplicates(int[] nums){

       int count = 1;
       int index = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i-1]){
                count++;
            }else {
                count = 1;
            }
            if (count <= 2){
                nums[index++] = nums[i];
            }

        }
        return index;

    }

}
