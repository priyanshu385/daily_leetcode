class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2];
        HashSet<Integer> set = new HashSet<>();
        for(int i=0,j=0;i<n;i++){
            if(!set.isEmpty() && set.contains(nums[i])){
                ans[j] = nums[i];
                j++;
            }
            else{
                set.add(nums[i]);
            }
        }
        return ans;
    }
}