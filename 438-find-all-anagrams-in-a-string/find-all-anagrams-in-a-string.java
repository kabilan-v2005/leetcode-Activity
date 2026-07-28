class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        int freq[] = new int[26];
        for(char c:p.toCharArray()){
            freq[c - 'a']++;
        }
        int count = p.length();
        int left = 0;
        for(int right = 0;right < s.length();right++){
            // int temp[] = freq.clone();
            // int j = 0;
            char c = s.charAt(right);
            // boolean b = true;
            if(freq[c - 'a'] > 0) count--;
            freq[c - 'a']--;
            if(right - left + 1 > p.length()){
                if(freq[s.charAt(left) - 'a'] >= 0) count++;
                freq[s.charAt(left) - 'a']++;
                left++;
            }
            if(count == 0) list.add(left);

            

        }
        return list;
    }
}