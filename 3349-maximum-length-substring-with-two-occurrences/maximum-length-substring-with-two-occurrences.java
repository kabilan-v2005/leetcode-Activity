class Solution {
    public int maximumLengthSubstring(String s) {
        int start = 0;
        int freq[] = new int[26];
        int maxlen = Integer.MIN_VALUE;

        for(int end = 0;end < s.length();end++){
            char ch = s.charAt(end);
            freq[ch - 'a']++;

            while(freq[ch - 'a'] > 2){
                char c = s.charAt(start);
                freq[c - 'a']--;
                start++;
            }

            maxlen = Math.max(maxlen,end - start + 1);
        }

        return maxlen;
    }
}