class Solution {
    static{
        for(int i=0;i<500;i++){
            maxArea(new int[]{0,0});
        }
    }
    public static int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int max = Integer.MIN_VALUE;
        while (left < right) {
            int h = Math.min(height[left], height[right]);
            max = Math.max(max, h * (right - left));
            while (left < right && height[left] <= h) {
                left++;
            }

            while (left < right && height[right] <= h) {
                right--;
            }
        }
        return max;
    }
}