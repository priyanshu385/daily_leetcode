class Solution {
    public int[] productExceptSelf(int[] nums) {
    int n = nums.length;
    int[] ans = new int[n];
    int totalProduct = 1;
    int zeroCount = 0;
    for (int num : nums) {
        if (num == 0) {
            zeroCount++;
        } else {
            totalProduct *= num;
        }
    }
    for (int i = 0; i < n; i++) {
        if (zeroCount > 1) {
            ans[i] = 0;
        } else if (zeroCount == 1) {
            ans[i] = nums[i] == 0 ? totalProduct : 0;
        } else {
            ans[i] = totalProduct / nums[i];
        }
    }
    return ans;
    }
}