class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length; 
        int ans = n + 1;
        int window = 0;
        int l = 0;
        for(int r = 0; r < n; r++){
            window += nums[r];
            while(window >= target){
                ans = Math.min(ans, r-l+1);
                window -= nums[l++];
            }
        } 
        return ans ==  n+1 ? 0 : ans;
    }
}