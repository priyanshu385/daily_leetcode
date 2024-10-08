class Solution {
    public int[] diStringMatch(String s) {
                int[] ans = new int[s.length() + 1];  
                int I = 0;
                int D = s.length();
                for (int i = 0; i < s.length(); i++) {
                        if (s.charAt(i) == 'I') {
                                ans[i] = I;
                                I++;
                        } else {
                                ans[i] = D;
                                D--;
                        }
                }
                ans[s.length()] = I;
        return ans;
    }
}