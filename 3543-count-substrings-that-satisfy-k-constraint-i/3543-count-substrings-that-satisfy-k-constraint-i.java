class Solution {
    public int countKConstraintSubstrings(String s, int k) {
       int ans = 0;
        for(int i = 0; i < s.length(); i++){
            int countof0 = 0;
            int countof1 = 0;
            for(int j = i; j < s.length(); j++){
                if(s.charAt(j) == '0'){
                        countof0++;
                }
                if(s.charAt(j) == '1'){
                    countof1++;
                }
                if(countof0 <= k || countof1 <= k){
                    ans++;
                }

            }
        }
               return ans;
                // System.out.println(ans);
        
    }
}