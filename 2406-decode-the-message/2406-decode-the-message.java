class Solution {
    public String decodeMessage(String key, String message) {
        HashMap<Character,Character> mp = new HashMap<>();
        char l = 'a';
        for(char ch: key.toCharArray()){
            if(ch !=' ' && !mp.containsKey(ch)) mp.put(ch,l++);
        }
        StringBuilder sb = new StringBuilder();
        for(char ch: message.toCharArray()){
            if(ch==' ') sb.append(" ");
            else sb.append(mp.get(ch));
        }
        return sb.toString();
    }
}