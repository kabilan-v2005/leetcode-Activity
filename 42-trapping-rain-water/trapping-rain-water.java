class Solution {
    public int trap(int[] height) {
        int l = 0;
        int r = height.length -1;
        int lmax = 0;
        int rmax= 0;
        int size = 0;

        while(l < r){
            if(height[l] < height[r]){
                if(height[l] >= lmax){
                    lmax = height[l];
                }
                else{
                    size += lmax - height[l];
                }
                l++;
            }
            else{
                if(height[r] >= rmax){
                    rmax = height[r];
                }
                else{
                    size += rmax - height[r];
                }
                r--;
            }
        }
        return size;
    }
}