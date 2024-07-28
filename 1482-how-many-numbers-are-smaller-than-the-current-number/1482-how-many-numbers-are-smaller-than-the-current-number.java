class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length; 
        int count = 0;
        int[] ans = new int[n];
        for(int i = 0; i < n; i++){
            for(int j = n-1; j >= 0; j--){
                if(nums[i] > nums[j]){
                    count++;
                }else if(nums[i] == 0){
                    continue;
                }
            }
            ans[i] = count;
            count = 0;
        }
        return ans;
    }
}