package easy;

public class RemoveDuplicates {

    public static void main(String[] args) {

        System.out.println(removeDuplicates(new int[]{1, 1, 2}));
        System.out.println(removeDuplicates2(new int[]{1, 1, 2}));

    }

    private static int removeDuplicates(int[] nums){

        int k = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[k] != nums[i]){
                k++;
                nums[k] = nums[i];
            }
        }

        return k+1;

    }

    private static int removeDuplicates2(int[] nums){

        int k = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i-1]){
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }

}
