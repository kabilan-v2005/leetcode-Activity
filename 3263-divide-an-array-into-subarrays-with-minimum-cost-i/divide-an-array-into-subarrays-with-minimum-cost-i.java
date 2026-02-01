class Solution {
    public int minimumCost(int[] nums) {
        int sum=nums[0];
        int min=Integer.MAX_VALUE;
        int secmin=Integer.MAX_VALUE;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<min){
                secmin=min;
                min=nums[i];
        }
        else if (nums[i] < secmin) { 
                secmin = nums[i];
            }
        }
        sum+=min;
        sum+=secmin;
        return sum;
    }
}