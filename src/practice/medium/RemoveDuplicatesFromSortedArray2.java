package practice.medium;

public class RemoveDuplicatesFromSortedArray2 {
    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{0,0,1,1,1,1,2,3,3}));
    }

    static int removeDuplicates(int[] nums){

        //if element appears 1 or 2 times most we assume that its unique;
        int index = 1; // where we place elements
        int count = 1; // every element appears at least once

        for (int i = 1; i < nums.length; i++) {
            //count elements how many times it appears
            if (nums[i] == nums[i-1]){
                count++;
            }else{
                count = 1;
            }
            //if its less than or equal 2, its unique
            if (count <= 2){
                nums[index++] = nums[i];
            }
        }
        return index;


    }

}
