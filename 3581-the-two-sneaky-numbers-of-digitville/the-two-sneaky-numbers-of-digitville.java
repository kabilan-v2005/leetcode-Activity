class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        int[] result = new int[2];
        int idx = 0;

        for (int num : nums) {
            if (!seen.add(num)) {   // duplicate found
                result[idx++] = num;
            }
        }
        return result;
    }
}
