class Solution {
    public int[] shortestToChar(String s, char c) {
       int[] ans = new int[s.length()];
    int prev = -s.length();  
    for (int i = 0; i < s.length(); i++) {
        if (s.charAt(i) == c) {
            prev = i; 
        }
        ans[i] = i - prev;  
    }
    
    prev = 2 * s.length();
    
    for (int i = s.length() - 1; i >= 0; i--) {
        if (s.charAt(i) == c) {
            prev = i; 
        }
        ans[i] = Math.min(ans[i], prev - i);  
    }
    return ans;
    }
}