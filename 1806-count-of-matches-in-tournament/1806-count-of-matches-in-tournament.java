class Solution {
    public int numberOfMatches(int n) {
        int match = 0;
        int ad = 0;
        while(n >= 2){
            if(n%2 == 0){
                match = match + (n/2);
                ad = n/2;
            }else if(n%2 != 0){
                match = match + (n-1)/2;
                ad = ((n-1)/2)+1;
            }
            n = ad;
        }
        return match;
    }
}