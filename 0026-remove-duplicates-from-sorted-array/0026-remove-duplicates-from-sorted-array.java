class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0; 
        for(int j = 0; j < nums.length; j++){
            if(nums[i] != nums[j]){
                i++;
                nums[i] = nums[j];
            }
        }
       return 1 + i;
    }
}