class Solution {
    public String mergeAlternately(String word1, String word2) {
      String s = "";
                int maxLength = Math.max(word1.length(), word2.length());

                for (int i = 0; i < maxLength; i++) {
                        if (i < word1.length()) {
                                s = s + word1.charAt(i);
                        }
                        if (i < word2.length()) {
                                s = s + word2.charAt(i);
                        }
                }

                return s;
    }
}