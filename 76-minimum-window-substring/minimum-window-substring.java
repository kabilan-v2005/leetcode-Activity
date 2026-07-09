import java.util.*;

class Solution {
    public String minWindow(String s, String t) {

        if (s.length() < t.length())
            return "";

        HashMap<Character, Integer> need = new HashMap<>();
        HashMap<Character, Integer> window = new HashMap<>();

        // Frequency map of t
        for (char c : t.toCharArray()) {
            need.put(c, need.getOrDefault(c, 0) + 1);
        }

        int required = need.size(); // number of unique chars needed
        int formed = 0;

        int start = 0;

        int minLen = Integer.MAX_VALUE;
        int minStart = 0;

        for (int end = 0; end < s.length(); end++) {

            char c = s.charAt(end);

            window.put(c, window.getOrDefault(c, 0) + 1);

            // Character frequency is now satisfied
            if (need.containsKey(c) &&
                window.get(c).intValue() == need.get(c).intValue()) {
                formed++;
            }

            // Try shrinking the window
            while (formed == required) {

                if (end - start + 1 < minLen) {
                    minLen = end - start + 1;
                    minStart = start;
                }

                char left = s.charAt(start);

                window.put(left, window.get(left) - 1);

                if (need.containsKey(left) &&
                    window.get(left) < need.get(left)) {
                    formed--;
                }

                start++;
            }
        }

        return minLen == Integer.MAX_VALUE
                ? ""
                : s.substring(minStart, minStart + minLen);
    }
}