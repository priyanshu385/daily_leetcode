class Solution {
    public int repeatedNTimes(int[] nums) {
        int count = 1;
        for(int i = 0; i < nums.length - 1; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] == nums[j]){
                    count++;
                    if(count == nums.length/2){
                        return nums[i];
                    }
                }
            }
        }
        return -1;
        
    }
}