class Solution {
    public int findKthLargest(int[] nums, int k) {
        
        // Arrays.sort(nums);
        // return nums[nums.length - k ];
        int n = nums.length;
        int pos = k+n;
        PriorityQueue<Integer>  pq = new PriorityQueue<>();
        int max = 0;
        for (int num : nums) {
            pq.offer(num);

            if (pq.size() > k) {
                pq.poll();
            }
        }
        return pq.peek();
    }
}