class Solution {
    public int findPermutationDifference(String s, String t) {
        int ans = 0;
        int temp = 0;
        for(int i = 0; i < s.length();i++){
            for(int j = 0; j < t.length();j++){
                if(s.charAt(i) == t.charAt(j)){
                  if(i > j){
                    temp = i - j;
                  }
                  else if(i < j){
                    temp = -(i - j);
                  }
                }
            }
            ans = ans + temp;
            temp = 0;
        }

        return ans;
        
    }
}