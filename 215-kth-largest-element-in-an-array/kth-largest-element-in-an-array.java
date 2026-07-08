class Solution {
    public int findKthLargest(int[] nums, int k) {
        
        // Arrays.sort(nums);
        // return nums[nums.length - k ];
        int n = nums.length;
        PriorityQueue<Integer>  pq = new PriorityQueue<>((a,b) -> b - a);
        for(int i = 0;i < n;i++){
            pq.offer(nums[i]);
        }
        int max = pq.poll();
        for(int i = 1;i < k;i++){
            max = pq.poll();
        }
        return max;
    }
}