class Solution {
    public int[] concatWithReverse(int[] nums) {
        int res[] = new int[nums.length * 2];
        for(int i = 0;i < nums.length;i++){
            res[i] = nums[i];
            res[nums.length* 2 - i - 1] = nums[i];
        }
        return res;
    }
}