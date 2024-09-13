class Solution {
    public int[] separateDigits(int[] nums) {
       ArrayList<Integer> list = new ArrayList<>();
        for(int x : nums){
           List<Integer> temp = new ArrayList<>();
            while (x > 0) {
                temp.add(x % 10);
                x = x/10;
            }
            for (int j = temp.size() - 1; j >= 0; j--) {
                list.add(temp.get(j));
            }
        }
        int [] result = new int[list.size()];
        for(int i=0;i<list.size();i++){
            result[i] = list.get(i);
        }
        return result;
    }
}