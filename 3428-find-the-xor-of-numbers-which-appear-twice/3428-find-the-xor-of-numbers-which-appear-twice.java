class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        int temp = 0;
        int n = nums.length;
        for(int i = 0; i < n -1; i++){
            for(int j = i + 1;j < n; j++){
                 if(nums[i] == nums[j]){
                    temp = temp ^ nums[i];
                 }
            }
        }
        return temp;
        
    }
}