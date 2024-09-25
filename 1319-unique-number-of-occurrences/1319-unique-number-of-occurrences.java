class Solution {
    public boolean uniqueOccurrences(int[] arr) {
         HashMap<Integer,Integer> countOccurences = new HashMap<>();
        HashSet<Integer> isExist  = new HashSet<>();
        for(int i = 0; i < arr.length; i++){
            countOccurences.put(arr[i],countOccurences.getOrDefault(arr[i],0)+1);
        }
        for(int val:countOccurences.values()){
            if( ! isExist.contains(val)) isExist.add(val);
            else return false;
        }
        return true;
        
        
    }
}