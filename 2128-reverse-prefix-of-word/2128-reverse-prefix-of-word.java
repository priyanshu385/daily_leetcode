class Solution {
    public String reversePrefix(String str, char ch) {
        StringBuilder nstr = new StringBuilder();
        boolean reversed = false;
        for(int i = 0; i < str.length();i++){
           nstr.append(str.charAt(i));
            if (!reversed && ch == str.charAt(i)) {
                nstr.reverse();
                reversed = true;
            }
       }
        return nstr.toString();
    }
}