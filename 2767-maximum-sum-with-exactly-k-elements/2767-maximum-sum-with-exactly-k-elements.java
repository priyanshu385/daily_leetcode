class Solution {
    public int maximizeSum(int[] nums, int k) {
       Arrays.sort(nums);
        int n = nums.length;
        int m = 1;
        int ans = nums[n-1];
        while(k > 1){
            m = m + nums[n - 1];
            nums[n - 1] = m;
            ans = ans + m;
            m = 1;
            k--;
        }
        return ans;
        
    }
}