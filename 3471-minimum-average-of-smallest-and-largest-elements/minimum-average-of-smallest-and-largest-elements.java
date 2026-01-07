import java.util.Arrays;
class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        ArrayList<Double> list=new ArrayList<>();  
        
        int l=0,r=nums.length-1;
        while(l<r){
            list.add((nums[l] + nums[r]) /2.0);
            l++;
            r--;
        }
        return Collections.min(list);
    }
}