class Solution {
    public int minimumDeletions(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int minpos = 0;
        int maxpos = 0;
        for(int i = 0;i < nums.length;i++){
            if(nums[i] < min){
                min = nums[i];
                minpos = i;
            }
            if(nums[i] > max){
                max = nums[i];
                maxpos = i;
            }
        }
        int left = Math.min(minpos , maxpos);
        int right = Math.max(minpos , maxpos);

        int n = nums.length;

        int front = right + 1;
        int back = n - left;

        int both = (left + 1) + (n - right);

        return Math.min(front,Math.min(back,both));

        

    }
}