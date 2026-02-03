class Solution {
    public boolean isTrionic(int[] nums) {
        
        int num=nums.length;
        if (num < 3) return false;
        int i=1;
        while(i<num && nums[i]>nums[i-1]) i++;
        if (i == 1 || i == num) return false;
        int p=i;
        while(p<num && nums[p]<nums[p-1]) p++;
         if (p == i || p == num) return false;
        int q=p;
        while(q<num && nums[q]>nums[q-1]) q++;
        
        return q==num;
    }
}