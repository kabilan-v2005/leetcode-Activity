class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character,Integer> map=new HashMap<>();
        for(char i:magazine.toCharArray()){
            map.put(i,map.getOrDefault(i ,0)+1);
        }  
        for(char c:ransomNote.toCharArray()){
            if(!map.containsKey(c) || map.get(c) <= 0) return false;
            map.put(c,map.get(c)-1);
        } 
        return true;
        }
}