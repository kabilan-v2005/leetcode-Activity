class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        if (n <= 1) return;
        k=k%n;

        for(int i=0;i<n/2;i++){
            int temp=nums[i];
            nums[i]=nums[n-1-i];
            nums[n-1-i]=temp;
        }
        for(int i=0;i<k/2;i++){
            int t=nums[i];
            nums[i]=nums[k-1-i];
            nums[k-1-i]=t;
        }
        for(int i=0;i<(n-k)/2;i++){
            int te=nums[k+i];
            nums[k+i]=nums[n-1-i];
            nums[n-1-i]=te;
        }
        
    }
}