class Solution {
    public int countMaxOrSubsets(int[] nums) {
        int n = nums.length;
        int maxOR = 0;
        
        for (int i = 1; i < (1 << n); i++) {
            int currentOR = 0;
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) != 0) {
                    currentOR |= nums[j];
                }
            }
            maxOR = Math.max(maxOR, currentOR);
        }
        int count = 0;
        for (int i = 1; i < (1 << n); i++) {
            int currentOR = 0;
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) != 0) {
                    currentOR |= nums[j];
                }
            }
            if (currentOR == maxOR) {
                count++;
            }
        }
        return count;
    }
}
