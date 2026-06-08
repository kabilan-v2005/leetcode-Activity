class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int lesscount = 0;
        
        int equalcount = 0;
        for(int i = 0;i < nums.length;i++){
            if(nums[i] < pivot) lesscount++;
            else if(nums[i] == pivot) equalcount++;
        }
        int arr[] = new int[nums.length];

        int mid = lesscount;
        int left = 0;
        int right = lesscount + equalcount;

        for(int i = 0;i < nums.length;i++){
            if(nums[i] < pivot){
                arr[left] = nums[i];
                left++;
            }
            else if(nums[i] == pivot) {
                arr[mid] = nums[i];
                mid++;
            }
            else{
                arr[right] = nums[i];
                right++;
            }
            }
        
        return arr;
    }
}