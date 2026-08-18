class Solution {
    public int largestInteger(int[] nums, int k) {
        // int start = 0;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i <= nums.length - k;i++){
            Set<Integer> set = new HashSet<>();
            for (int j = i; j < i + k; j++) {
                set.add(nums[j]);
            }
            for(int num : set){
                map.put(num,map.getOrDefault(num,0) + 1);
            }
        }
        int maxVal = -1;
        // int minfreq = Integer.MAX_VALUE;

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if (entry.getValue() == 1) {
                maxVal = Math.max(maxVal, entry.getKey());
            }
        }
        return maxVal;
    }
}