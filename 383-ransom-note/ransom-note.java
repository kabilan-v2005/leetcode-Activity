class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int n = ransomNote.length();
        int m = magazine.length();

        Map<Character,Integer> map1 = new TreeMap<>();
        Map<Character,Integer> map2 = new TreeMap<>();

        for(int i = 0;i < n;i++){
            char ch = ransomNote.charAt(i);
            map1.put(ch,map1.getOrDefault(ch,0) + 1);
        }
        for(int i = 0;i < m;i++){
            char ch = magazine.charAt(i);
            map2.put(ch,map2.getOrDefault(ch,0) + 1);
        }

        for (char key : map1.keySet()) {

            if (!map2.containsKey(key) || map2.get(key)  < map1.get(key)) {
                return false;
            }
        }


        return true;


    }
}