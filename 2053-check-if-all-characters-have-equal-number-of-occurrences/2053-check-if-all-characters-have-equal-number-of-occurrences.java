class Solution {
    public boolean areOccurrencesEqual(String s) {
      int precount = -1;
      int curcount = 1;
      boolean flage = true;
      char[] arr = s.toCharArray();
      Arrays.sort(arr);
      for (int i = 0; i < s.length() - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                curcount++;
            } else {                        
            if (precount == -1) {
                precount = curcount;
            } else if (precount != curcount) {
                        flage = false;
                        break;
                }
                        curcount = 1;
                            }
                    }
                    if (precount != -1 && precount != curcount) {
                            flage = false;
                    }
                    return flage;              
        
    }
}