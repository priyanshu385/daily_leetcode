class Solution {
    public int countKDifference(int[] nums, int k) {
        int n = nums.length;
        int count = 0;
        for (int i = 1; i < n; i++) {
	for (int j = i - 1; j >= 0; j--) {
		if (nums[i] > nums[j] && nums[i] - nums[j] == k) {
			count++;
		}
		if (nums[i] < nums[j] && nums[j] - nums[i] == k) {
			count++;
		}
	}
}
        return count;
        
    }
}