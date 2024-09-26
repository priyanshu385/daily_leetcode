class Solution {
    public String removeTrailingZeros(String num) {
        int count=num.length()-1;
        for(int i=num.length()-1; i>=0; i--){
            if(num.charAt(i)=='0'){
                 count=i-1;
            } else{
                break;
            }
        }
        
        return num.substring(0,count+1);

        
    }
}