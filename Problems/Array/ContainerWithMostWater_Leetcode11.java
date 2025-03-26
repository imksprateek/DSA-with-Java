package Problems.Array;

public class ContainerWithMostWater_Leetcode11 {
    public static void main(String[] args) {
        System.out.println(maxArea(new int[] {1,8,6,2,5,4,8,3,7}));
    }

    public static int maxArea(int[] height) {
        int max = Integer.MIN_VALUE;

        int first=0, last=height.length-1;

        while(first<last){
            int area = Math.min(height[first], height[last]) * (last-first);

            if(area > max){
                max = area;
            }

            if(height[first] <= height[last]){
                first++;
            }else{
                last--;
            }
        }

        return max;
    }
}
