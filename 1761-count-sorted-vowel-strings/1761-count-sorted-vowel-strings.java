class Solution {
    public int countVowelStrings(int n) {
        return combination(n + 4, 4);
    }

    private int combination(int n, int r) {
        if (r > n - r) {
            r = n - r;
        }
        int result = 1;
        for (int i = 0; i < r; i++) {
            result = result * (n - i) / (i + 1); 
        }
        return result;
    }
    
}