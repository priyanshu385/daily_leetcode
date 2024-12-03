class Solution {
    public String reverseWords(String s) {
    String[] sarr = s.trim().split("\\s+");
    int j = sarr.length - 1;
    for (int i = 0; i < sarr.length / 2; i++) {
        String temp = sarr[i];
        sarr[i] = sarr[j];
        sarr[j] = temp;
        j--;
    }
    return String.join(" ", sarr);
    }
}