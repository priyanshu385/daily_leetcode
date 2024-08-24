class Solution {
    public int[] findArray(int[] pref) {
        int n = pref.length;
        int[] ans = new int[n];
        int store = pref[0];
        ans[0] = pref[0];
        for(int i = 1; i < n; i++){
            store = store ^ pref[i];
            ans[i] = store;
            store = pref[i];
        }
        return ans;
        
    }
}