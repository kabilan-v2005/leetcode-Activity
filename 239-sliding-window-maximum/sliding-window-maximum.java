class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int start = 0;
        // int max = Integer.MIN_VALUE;
        Deque<Integer> dq = new ArrayDeque<>();
        int arr[] = new int[n - k + 1];
        int idx = 0;
        for(int i = 0;i < n;i++){
            while(!dq.isEmpty() && dq.peekFirst() <= i - k){
                dq.removeFirst();
            }

            while(!dq.isEmpty() && nums[dq.peekLast()] < nums[i]){
                dq.removeLast();
            }

            dq.addLast(i);

            if(i >= k -1){
                arr[idx++] = nums[dq.getFirst()];
            }
        }
        return arr;
    }
}