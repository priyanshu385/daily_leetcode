class Solution {
    public int minOperations(int[] nums, int k) {
        int count = 0;
        int xor1 = 0;
        for(int i = 0;i < nums.length;i++){
            xor1 = xor1 ^ nums[i];
        }
        if(xor1 == k){
            return 0;
        }
        int key = xor1 ^ k;
        while(key > 0){
            count++;
            key = key & (key - 1);
        }
        return count;
        
    }
}