class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int j = nums.length - 1;
        int max = 0;
        for(int i = 0; i < nums.length / 2; i++){
           int sum = nums[i] + nums[j];
           j--;
           if(max < sum){
            max = sum;
           }
           
        }
        return max;
    }
}