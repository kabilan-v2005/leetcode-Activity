class Solution {

    public int longestCommonPrefix(int[] arr1, int[] arr2) {

        Set<String> set = new HashSet<>();

        // Store all prefixes from arr1
        for (int num : arr1) {

            String s = String.valueOf(num);

            String prefix = "";

            for (int i = 0; i < s.length(); i++) {

                prefix += s.charAt(i);

                set.add(prefix);
            }
        }

        int max = 0;

        // Check prefixes from arr2
        for (int num : arr2) {

            String s = String.valueOf(num);

            String prefix = "";

            for (int i = 0; i < s.length(); i++) {

                prefix += s.charAt(i);

                if (set.contains(prefix)) {
                    max = Math.max(max, i + 1);
                }
            }
        }

        return max;
    }
}