class Solution {
    public void rotate(int[][] m) {
       int n = m.length; 
       for(int i = 0 ;i < (n + 1)/2;i++){
        for(int j = 0; j < n/2; j++){
            int temp = m[n - 1 - j][i];
            m[n - 1 - j][i] = m[n-1-i][n-j-1];
            m[n-1-i][n-j-1] = m[j][n-1-i];
            m[j][n-1-i] = m[i][j];
            m[i][j] = temp;
        }
       }
    }
}