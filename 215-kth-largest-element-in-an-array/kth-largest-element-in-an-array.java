class Solution {
    public int findKthLargest(int[] nums, int k) {
        // Set<Integer> set = new HashSet<>();
        // Arrays.sort(nums);
        // for(int i:nums){
        //     set.add(i);
        // }
        // int arr[]=new int[set.size()];
        // int idx = 0;
        // for(int j:set){
        //     arr[idx] = j;
        //     idx++;
        // }
        Arrays.sort(nums);
        return nums[nums.length - k ];
    }
}