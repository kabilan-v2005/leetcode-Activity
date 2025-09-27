class Solution {
    public int[] buildArray(int[] nums) {
        // ArrayList<Integer> arr=new ArrayList<>();
        // for(int num:nums)
        //     arr.add(num);
        int array[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            array[i]=nums[nums[i]];
        }
        return array;
    }
}