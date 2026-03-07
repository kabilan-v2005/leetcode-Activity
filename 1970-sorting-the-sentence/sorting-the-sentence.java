class Solution {
    public String sortSentence(String s) {
        String[] words = s.split(" ");
        String[] res = new String[words.length];

        for (String w : words) {
            int idx = w.charAt(w.length() - 1) - '1';
            res[idx] = w.substring(0, w.length() - 1);
        }

        return String.join(" ", res);
    }
}