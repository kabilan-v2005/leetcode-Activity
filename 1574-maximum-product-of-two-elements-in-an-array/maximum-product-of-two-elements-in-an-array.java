class Solution {
    public int maxProduct(int[] nums) {
        PriorityQueue<Integer> q=new PriorityQueue<>(Comparator.reverseOrder());
        for(int i:nums){
            q.offer(i);
        }
        int a=q.poll();
        int b=q.poll();
        // Arrays.sort(nums);
        return (a-1)*(b-1);

    }
}