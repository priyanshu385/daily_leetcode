class Solution {
    public boolean isPalindrome(int x) {
       String s = Integer.toString(x);
        StringBuilder ans = new StringBuilder();
        for(int i = s.length() - 1; i >= 0; i--){
            ans.append(s.charAt(i));
        }
        if(ans.toString().equals(s)){
            return true;
        }
        return false;
    }
}