class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n=nums.length;
        int result[]=new int[n];
        
        int leftsum[]=new int[n];
        int rigthsum[]=new int[n];

        leftsum[0]=0;
        rigthsum[n-1]=0;
        for(int i=1;i<n;i++){
            leftsum[i]=nums[i-1]+leftsum[i-1];
        }
        for(int i=n-1;i>0;i--){
            rigthsum[i-1]=nums[i]+rigthsum[i];
        }

        for(int i=0;i<n;i++){
            result[i]=Math.abs(leftsum[i]-rigthsum[i]);
        }
        
        return result;

        
    }
}