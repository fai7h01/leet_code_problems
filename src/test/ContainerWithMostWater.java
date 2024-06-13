package test;

public class ContainerWithMostWater {

    public static void main(String[] args) {

        System.out.println(maxArea(new int[]{1,8,6,2,5,4,8,3,7}));

    }

    public static int maxArea(int[] height){

        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        for (int i = 0; i < height.length; i++) {

            int h = Math.min(height[left],height[right]);
            int w = right - left;
            int area = h * w;
            maxArea = Math.max(maxArea, area);
            if (height[left] < height[right]){
                left++;
            }else{
                right--;
            }

        }
        return maxArea;



    }

}
