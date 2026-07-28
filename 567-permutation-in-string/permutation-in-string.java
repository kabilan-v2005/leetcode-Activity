class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int freq[] = new int[26];
        for(char c : s1.toCharArray()){
            freq[c - 'a']++;
        }

        int start = 0;
        // int p = 1;
        
        for(int end = 0;end < s2.length();end++){
            freq[s2.charAt(end) - 'a']--;
            while(freq[s2.charAt(end) - 'a'] < 0){
                freq[s2.charAt(start) - 'a']++;
                start++;
            }
            
            if(end - start + 1 == s1.length()){
                return true;
            }
        }
        
        // for(char ch : s1.toCharArray()){
        //     if(freq[ch -'a'] > 0) return false;
        // }
        return false;
    }
}