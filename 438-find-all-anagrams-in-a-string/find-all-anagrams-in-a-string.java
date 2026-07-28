class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        int freq[] = new int[26];
        for(char c:p.toCharArray()){
            freq[c - 'a']++;
        }

        for(int right = 0;right <= s.length() - p.length();right++){
            int temp[] = freq.clone();
            // int j = 0;
            boolean b = true;
            for(int j = 0;j < p.length();j++){
                char c = s.charAt(right + j);
                temp[c - 'a']--;
                if(temp[c - 'a'] < 0){
                    b = false;
                    break;
                }
                // left++;
                // j++;
            }
            if(b) list.add(right);

        }
        return list;
    }
}