
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer> arr = new ArrayList<>();

        for (int num : nums1) arr.add(num);
        for (int num : nums2) arr.add(num);

        Collections.sort(arr);

        int n = arr.size();
        if (n % 2 == 0) {
            
            return (arr.get(n/2) + arr.get(n/2 - 1)) / 2.0;
        } else {
            
            return arr.get(n/2);
        }
    }
}
