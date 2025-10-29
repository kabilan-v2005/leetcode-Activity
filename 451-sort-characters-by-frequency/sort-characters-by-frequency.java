import java.util.*;

class Solution {
    public String frequencySort(String s) {
        // Count frequency of every ASCII character
        int[] freq = new int[256];
        for (char c : s.toCharArray()) freq[c]++;

        // Collect characters that actually appear
        List<Integer> chars = new ArrayList<>();
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) chars.add(i);
        }

        // Sort by frequency descending; if tie -> by ASCII ascending
        Collections.sort(chars, (a, b) -> {
            if (freq[b] != freq[a]) return freq[b] - freq[a]; // higher freq first
            return a - b; // smaller ASCII first (e.g. 'A' before 'a')
        });

        // Build the result
        StringBuilder result = new StringBuilder();
        for (int ch : chars) {
            for (int k = 0; k < freq[ch]; k++) result.append((char) ch);
        }

        return result.toString();
    }
}
