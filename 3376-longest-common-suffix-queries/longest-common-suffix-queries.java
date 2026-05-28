class Solution {
    // Trie node
    class TrieNode {
        // 26 lowercase letters
        TrieNode[] children = new TrieNode[26];
        // shortest word length passing this node
        int bestLen = Integer.MAX_VALUE;
        // index of best word
        int bestIdx = Integer.MAX_VALUE;
    }
    public int[] stringIndices(String[] wordsContainer,
                               String[] wordsQuery) {
        // root of trie
        TrieNode root = new TrieNode();
        // -----------------------------
        // BUILD TRIE USING CONTAINER
        // -----------------------------
        for (int i = 0; i < wordsContainer.length; i++) {
            String word = wordsContainer[i];
            int len = word.length();
            TrieNode curr = root;

            // update root with shortest word
            // this helps when no suffix matches
            if (len < curr.bestLen ||
               (len == curr.bestLen && i < curr.bestIdx)) {

                curr.bestLen = len;
                curr.bestIdx = i;
            }
            // insert word in reverse order
            // because suffix matching
            for (int j = len - 1; j >= 0; j--) {
                int charIdx = word.charAt(j) - 'a';
                // create node if not exists
                if (curr.children[charIdx] == null) {

                    curr.children[charIdx] =
                            new TrieNode();
                }

                // move to next node
                curr = curr.children[charIdx];

                // store best answer at every node
                // choose:
                // 1. smaller length
                // 2. smaller index if tie
                if (len < curr.bestLen ||
                   (len == curr.bestLen &&
                    i < curr.bestIdx)) {

                    curr.bestLen = len;
                    curr.bestIdx = i;
                }
            }
        }
        // answer array
        int[] ans = new int[wordsQuery.length];

        // -----------------------------
        // PROCESS QUERIES
        // -----------------------------
        for (int i = 0; i < wordsQuery.length; i++) {

            String query = wordsQuery[i];
            int len = query.length();
            TrieNode curr = root;

            // search query in reverse
            // to match suffix
            for (int j = len - 1; j >= 0; j--) {

                int charIdx = query.charAt(j) - 'a';
                // stop if suffix path not found
                if (curr.children[charIdx] == null) {
                    break;
                }
                // move deeper
                curr = curr.children[charIdx];
            }
            // best index stored at deepest match
            ans[i] = curr.bestIdx;
        }

        return ans;
    }
}