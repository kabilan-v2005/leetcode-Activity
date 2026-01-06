class Solution {
    public int[] getConcatenation(int[] nums) {
        int arr[]=new int[2*nums.length];
        
        for(int i=0;i<nums.length;i++){
            arr[i]=nums[i];
        }
        int index=0;
        for(int j=nums.length;j<nums.length*2;j++){
            arr[j]=nums[index++];
        }
        return arr;
    }
}