class Solution {
    public String generateTheString(int n) {
        String s = "";
        if(n%2 != 0 || n == 1){
             for(int i = 1; i <= n; i++){
                s = s + "a";
        }}else{
            for(int j = 1; j < n; j++){
                s = s + "a";
            }
            s = s + "b";
        }
        return s;
        
    }
}