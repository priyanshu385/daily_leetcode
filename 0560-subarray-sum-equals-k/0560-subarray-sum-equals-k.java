class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> sumFreq = new HashMap<>();
        sumFreq.put(0, 1); 
        
        int sum = 0, count = 0;
        
        for (int num : nums) {
            sum += num;
            
            if (sumFreq.containsKey(sum - k)) {
                count += sumFreq.get(sum - k);
            }
            
            sumFreq.put(sum, sumFreq.getOrDefault(sum, 0) + 1);
        }
        
        return count;
    }
}