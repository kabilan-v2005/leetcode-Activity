class Solution {
    public int characterReplacement(String s, int k) {
        int freq[] = new int[26];
        int start = 0;
        int maxfreq = Integer.MIN_VALUE;
        int maxlen = Integer.MIN_VALUE;
        for(int end = 0;end < s.length();end++){
            freq[s.charAt(end) - 'A']++;
            for(int i = 0;i < 26;i++){
                if(freq[i] > maxfreq) maxfreq = freq[i];
            }
            int windowlen = end - start + 1;
            while(windowlen - maxfreq > k){
                freq[s.charAt(start) - 'A']--;
                start++;
                windowlen--;
            }
            maxlen = Math.max(maxlen,end - start + 1);
        }
        return maxlen;
    }
}