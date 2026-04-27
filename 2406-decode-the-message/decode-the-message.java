class Solution {
    public String decodeMessage(String key, String message) {
        Map<Character, Character> map = new HashMap<>();
        char ch='a';
        for (int i=0;i<key.length();i++) {
            char c=key.charAt(i);
            if(c!=' ' && !map.containsKey(c)){
                map.put(c,ch);
                ch++;
            }
            
        }
        StringBuilder res=new StringBuilder();
        for(int i=0;i<message.length();i++){
            char c=message.charAt(i);
            if(c==' '){
                res.append(' ');
            }
            else{
                res.append(map.get(c));
            }
        }
        return res.toString();
    }
}