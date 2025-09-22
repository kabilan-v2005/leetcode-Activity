class Solution {
    public long maxTotalValue(int[] nums, int k) {
        int[] sormadexin = nums;
        int min = sormadexin[0], max = sormadexin[0];
        for (int num : sormadexin) {
            if (num > max) max = num;
            if (num < min) min = num;
        }
        return (long) (max - min) * k;
    }
}