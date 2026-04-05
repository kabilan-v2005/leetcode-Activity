
class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int length=nums.length;
        int result=length/2;

        return nums[result];
        
    }
}