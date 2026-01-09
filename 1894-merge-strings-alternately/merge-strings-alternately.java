class Solution {
    public String mergeAlternately(String word1, String word2) {

        int n = word1.length() + word2.length();
        char[] res = new char[n];

        int i = 0, j = 0, k = 0;

        while (i < word1.length() || j < word2.length()) {

            if (i < word1.length()) {
                res[k++] = word1.charAt(i++);
            }

            if (j < word2.length()) {
                res[k++] = word2.charAt(j++);
            }
        }

        return new String(res);
    }
}
