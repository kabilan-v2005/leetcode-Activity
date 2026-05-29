class Solution {
    public int minElement(int[] nums) {
        int len = nums.length;
        int min = Integer.MAX_VALUE;

        for(int i = 0;i < len;i++){
            int n = nums[i];
            int sum = 0;
            while(n > 0){
                int d = n % 10;
                sum+=d;
                n/=10;
            }
            min = Math.min(min,sum);
        }
        return min;
    }
}