class Solution {
    public int maxProduct(int[] nums) {
        // PriorityQueue<Integer> q=new priorityQueue<>();
        // for(int i:nums){
        //     q.add(i);
        // }
        Arrays.sort(nums);
        return (nums[nums.length-1]-1)*(nums[nums.length-2]-1);

    }
}