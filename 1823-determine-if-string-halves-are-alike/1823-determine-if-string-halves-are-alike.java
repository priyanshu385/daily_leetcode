class Solution {
    public boolean halvesAreAlike(String s) {
       int count = 0;
            int count2 = 0;
            int j = s.length() - 1;
             String ns = s.toLowerCase();
            for(int i = 0; i <= (ns.length() - 1)/2;i++){
                if(ns.charAt(i) == 'a' || ns.charAt(i) == 'e' || ns.charAt(i) == 'i' || ns.charAt(i) == 'o' || ns.charAt(i) == 'u'){
                    count++;
                }if(ns.charAt(j) == 'a' || ns.charAt(j) == 'e' || ns.charAt(j) == 'i' || ns.charAt(j) == 'o' || ns.charAt(j) == 'u'){
                    count2++;
                }
                j--;
            }
        return count == count2;
        
    }
}