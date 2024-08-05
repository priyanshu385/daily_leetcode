class Solution {
    public String firstPalindrome(String[] words) {
        for (int i = 0; i < words.length; i++) {
            if (checkpalindrome(words[i])) {
                return words[i];
            }
        }
        return "";
    }

    public boolean checkpalindrome(String str) {
        int i = 0;
        int j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}