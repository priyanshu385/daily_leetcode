class Solution {
    public int[] distinctDifferenceArray(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            HashSet<Integer> hs = new HashSet<>();
            for (int j = 0; j <= i; j++) {
                hs.add(nums[j]);
            }
            HashSet<Integer> js = new HashSet<>();
            for (int j = i + 1; j < n; j++) {
                js.add(nums[j]);
            }
            ans[i] = hs.size()-js.size();
        }
        return ans;
        
    }
}