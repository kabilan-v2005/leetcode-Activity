class Solution {
    public int maxArea(int[] height) {
        int maxamt=0;
        int left=0;
        int right=height.length - 1;
        while(left<right){
            maxamt = Math.max(maxamt, (right - left) * Math.min(height[left], height[right]));
            if(height[left]<height[right]){
                left++;
            }else{
                right--;
            }
        }
        return maxamt;
    }
}