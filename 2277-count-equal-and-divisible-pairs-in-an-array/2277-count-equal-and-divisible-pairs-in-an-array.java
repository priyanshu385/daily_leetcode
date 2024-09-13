class Solution {
    public int countPairs(int[] nums, int k) {
        int n = nums.length;
        int temp = 0; 
        int count = 0;
        for(int i = 0; i < n - 1;i++){
            for(int j = i + 1; j < n; j++){
                if(nums[i] == nums[j]){
                    temp = i * j;
                    if(temp%k == 0){
                        count++;
                    }
                }
            }
            temp = 0;
        }
        return count;
        
    }
}