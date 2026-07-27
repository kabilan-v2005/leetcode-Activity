class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int n = ransomNote.length();
        int m = magazine.length();

        int freq[] = new int[26];
        // int freq2[] = new int[26];

        for(int i = 0;i < n;i++){
            char ch = ransomNote.charAt(i);
            freq[ch - 'a']++;
        }

        for(int i = 0;i < m;i++){
            char ch = magazine.charAt(i);
            if(freq[ch - 'a'] != 0)
            freq[ch - 'a']--;
        }

        for(int i = 0;i < n;i++){
            char ch = ransomNote.charAt(i);
            if(freq[ch - 'a'] != 0) return false;
        }


        return true;

    }
}