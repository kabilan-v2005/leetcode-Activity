class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n=nums.length;
        int res[] =new int[n];
        int l=0;
        int r=n-1;

        for(int i=0;i<n;i++){
            if(nums[i]<pivot){
                res[l++]=nums[i];
            }
            if(nums[n-1-i]>pivot){
                res[r--]=nums[n-i-1];
            }
        }
        while(l<=r){
            res[l++]=pivot;
        }
        return res;
    }
}