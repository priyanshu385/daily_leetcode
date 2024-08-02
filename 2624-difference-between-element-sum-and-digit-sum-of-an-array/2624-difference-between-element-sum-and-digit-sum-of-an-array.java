class Solution {
    public int differenceOfSum(int[] nums) {
         int ele_sum = 0;
        int d_sum = 0;
        for(int i=0;i<nums.length;i++){
            ele_sum+=nums[i];

            int val = nums[i];
            int x;
            
            while(val>0){
                x = val%10;
                d_sum +=x;
                val = val/10;
            }
        }
        return Math.abs(ele_sum - d_sum);
    }
}