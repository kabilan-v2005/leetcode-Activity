class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        //git linked
        int i;
        for (i = 0; i < nums.length; i++) {  
            if (i != nums[i]) {  
                return i; 
            }
        }
        return i; 
    }
}
