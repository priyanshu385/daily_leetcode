class Solution {
    public int percentageLetter(String s, char letter) {
        int count = 0;
        int ans = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == letter){
                count++;
            }
        }
        ans = (int) (((double) count / s.length()) * 100);
        return ans;

        
    }
}