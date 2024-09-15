class Solution {
    public int sumOfUnique(int[] nums) {
        Map<Integer, Integer> mp = new HashMap<>();
        int n = nums.length;
        int ans = 0;
       for (int i = 0; i < n; i++)
        {
            if (mp.containsKey(nums[i])) 
            {
                mp.put(nums[i], mp.get(nums[i]) + 1);
            } 
            else
            {
                mp.put(nums[i], 1);
            }
        }
         for (Map.Entry<Integer, Integer> entry : mp.entrySet())
        {
            if(entry.getValue() == 1){
                ans = ans + entry.getKey();
            }
        }
        return ans;
    }
}