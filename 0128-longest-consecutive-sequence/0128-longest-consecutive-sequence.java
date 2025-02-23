class Solution {
    public int longestConsecutive(int[] nums) {
         if (nums.length == 0) return 0;

        Arrays.sort(nums);

        int longest = 1, currentStreak = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                continue; 
            } else if (nums[i] == nums[i - 1] + 1) {
                currentStreak++; 
            } else {
                longest = Math.max(longest, currentStreak); 
                currentStreak = 1;
            }
        }

        return Math.max(longest, currentStreak);
    }
}