import java.util.*;

class Solution {
    public String frequencySort(String s) {
        int[] freq = new int[256];
        for (char c : s.toCharArray()) freq[c]++;

        List<Integer> chars = new ArrayList<>();
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) chars.add(i);
        }

       
        Collections.sort(chars, (a, b) -> {
            if (freq[b] != freq[a]) return freq[b] - freq[a]; 
            return a - b; 
        });

        StringBuilder result = new StringBuilder();
        for (int ch : chars) {
            for (int k = 0; k < freq[ch]; k++) result.append((char) ch);
        }

        return result.toString();
    }
}
