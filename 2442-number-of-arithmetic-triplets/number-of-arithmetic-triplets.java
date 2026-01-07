import java.util.*;

class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {

        Set<Integer> set = new HashSet<>();
        for (int n : nums) {
            set.add(n);
        }

        int count = 0;

        for (int n : nums) {
            if (set.contains(n + diff) && set.contains(n + 2 * diff)) {
                count++;
            }
        }

        return count;
    }
}
