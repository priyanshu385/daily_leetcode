class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
       int a = nums[0];
       int b = nums[n-1];
       int ans = 0;
       for(int i = b; i >= 1;i--){
           if(a%i == 0 && b%i == 0){
               ans = i;
               break;
           }
       }
       return ans;
    }
}