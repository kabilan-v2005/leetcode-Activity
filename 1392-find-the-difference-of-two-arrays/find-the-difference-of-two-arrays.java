import java.util.*;

class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

            Set<Integer> set1 = new HashSet<>();
                    Set<Integer> set2 = new HashSet<>();

                            // Build sets (O(n + m))
                                    for (int n : nums1) set1.add(n);
                                            for (int n : nums2) set2.add(n);

                                                    List<Integer> diff1 = new ArrayList<>();
                                                            List<Integer> diff2 = new ArrayList<>();

                                                                    // nums1 - nums2
                                                                            for (int n : set1) {
                                                                                        if (!set2.contains(n)) {
                                                                                                        diff1.add(n);
                                                                                                                    }
                                                                                                                            }

                                                                                                                                    // nums2 - nums1
                                                                                                                                            for (int n : set2) {
                                                                                                                                                        if (!set1.contains(n)) {
                                                                                                                                                                        diff2.add(n);
                                                                                                                                                                                    }
                                                                                                                                                                                            }

                                                                                                                                                                                                    List<List<Integer>> result = new ArrayList<>();
                                                                                                                                                                                                            result.add(diff1);
                                                                                                                                                                                                                    result.add(diff2);

                                                                                                                                                                                                                            return result;
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                