class Solution {
    public int mostWordsFound(String[] s) {
        int count = 0;
        int max = 0;
        for(int i = 0; i < s.length;i++){
            for(int j = 0; j < s[i].length();j++){
                if(s[i].charAt(j) == ' '){
                    count++;
                }
            }
            if(count > max){
                max = count;
                count = 0;
            }
            count = 0;
        }
       return max + 1;
        
    }
}