class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int start = 0;
        int count = 0;
        int oddCount = 0;
        int tempCount = 0;
        for(int end = 0;end < nums.length;end++){
            if(nums[end] % 2 != 0){
                oddCount++;
                tempCount = 0;
            }

            while(oddCount == k){
                if(nums[start] % 2 != 0){
                    oddCount--;
                }
                tempCount++;
                start++;
            }

            count += tempCount;
        }
        return count;
    }
}