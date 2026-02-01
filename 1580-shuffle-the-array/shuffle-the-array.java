class Solution {
    public int[] shuffle(int[] nums, int n) {
        int len=nums.length;
        int arr[]=new int[len];
        int p=0;
        
        for(int i=0;i<n;i++){
            arr[p]=nums[i];
            arr[p+1]=nums[n+i];
            
            p+=2;
            
        }
        return arr;
    }
}