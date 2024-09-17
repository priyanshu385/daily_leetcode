class Solution {
    public String reverseWords(String s) {
            String[] words = s.split(" ");
            for (int i = 0; i < words.length; i++) {
                words[i] = reverseString(words[i]);
            }
            String result = String.join(" ", words);
            return result;
        }
        public static String reverseString(String word) {
            char[] charArray = word.toCharArray();
            int j = charArray.length - 1;
            for (int i = 0; i < charArray.length / 2; i++) {
                char temp = charArray[i];
                charArray[i] = charArray[j];
                charArray[j] = temp;
                j--;
            }
            return new String(charArray);
        }
}