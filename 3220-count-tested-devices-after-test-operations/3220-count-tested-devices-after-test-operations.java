class Solution {
    public int countTestedDevices(int[] BP) {
        int n = BP.length;
      int count = 0;
      for(int i = 0;i < n; i++){
          if(BP[i] > 0){
              count++;
              for(int j = 1; j < n; j++){
                  if(BP[j] == 0){
                      continue;
                  }else {
                      BP[j] = BP[j] - 1;
                  }
              }
          }else{
              continue;
          }
      }
       return count;
    }
}