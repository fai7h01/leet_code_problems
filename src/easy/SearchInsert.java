package easy;

public class SearchInsert {

    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target = 2;
        System.out.println(searchInsert(nums, target));
    }

    private static int searchInsert(int[] nums, int target){

        int n = nums.length;
        int left = 0;
        int right = nums.length - 1;

        int mid = 0;

        while(left <= right){
            mid = (left + right) / 2;

            if (nums[mid] == target) return mid;
            if (nums[mid] < target) left = mid + 1;
            if (nums[mid] > target) right = mid - 1;
        }
        return right+1;

    }
}
