class Solution {
    public int maxFrequencyElements(int[] nums) {
         Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (frequencyMap.containsKey(num)) {
                frequencyMap.put(num, frequencyMap.get(num) + 1);
            } else {
                frequencyMap.put(num, 1);
            }
        }
        int maxFrequency = 0;
        for (int i = 0; i < frequencyMap.size(); i++) {
            int freq = (int) frequencyMap.values().toArray()[i];
            if (freq > maxFrequency) {
                maxFrequency = freq;
            }
        }
        int totalMaxFrequency = 0;
        for (int i = 0; i < frequencyMap.size(); i++) {
            int freq = (int) frequencyMap.values().toArray()[i];
            if (freq == maxFrequency) {
                totalMaxFrequency += freq;
            }
        }

        return totalMaxFrequency;
    }
}