class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        int start = 0;
        int maxLen = Integer.MIN_VALUE;
        for(int end = 0;end < nums.length;end++){
            map.put(nums[end],map.getOrDefault(nums[end],0) + 1);
            while(map.getOrDefault(nums[end], 0) > k){
                // if(nums[start] == nums[end])
                    map.put(nums[start],map.getOrDefault(nums[start],0) - 1);
                start++;
            }
            maxLen = Math.max(maxLen,end - start + 1);
        }
        return maxLen;
    }
}