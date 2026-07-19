class Solution {
    public int lengthOfLongestSubstring(String s) {
        // if(s.equals("")) return 0;
        int start = 0;
        
        boolean b[] = new boolean[128];

        int maxLen = 0;

        for(int end = 0; end < s.length();end ++){
            int ch = s.charAt(end);
            while(b[ch]){
                b[s.charAt(start)] = false;
                start++;
            }
            b[ch] = true;
            maxLen = Math.max(maxLen, (end - start)+ 1);
        }

        return 
        maxLen;
    }
}