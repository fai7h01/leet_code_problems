package interview_prep;

public class ContainerWithMostWater {

    public static void main(String[] args) {

    }

    public static int maxArea(int[] height){

        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while (left < right){
            int w = right - left;
            int h = Math.min(height[left], height[right]);
            maxArea = Math.max(maxArea, w * h);
            if (height[left] < height[right]){
                left++;
            }else{
                right--;
            }
        }
        return maxArea;
    }

}
