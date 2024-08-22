class Solution {
    public int arrayPairSum(int[] nums) {
         Arrays.sort(nums);
        int ans = 0;
        int j  = 1;
        for(int i = 0; i < nums.length - 1; i = i + 2){
                ans = ans + Math.min(nums[i],nums[j]);
                j = j + 2;
        }
        return ans;
        
    }
}