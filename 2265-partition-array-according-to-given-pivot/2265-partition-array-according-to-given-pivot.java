class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 1; i <= 3; i++){
            for(int j = 0; j < nums.length; j++){
                if(i == 1 && nums[j] < pivot){
                    list.add(nums[j]);
                }
                if(i == 2 && nums[j] == pivot){
                    list.add(nums[j]);
                }
                if(i == 3 && nums[j] > pivot){
                    list.add(nums[j]);
                }
            }
        }
        int[] ans = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }

        return ans;
    }
}