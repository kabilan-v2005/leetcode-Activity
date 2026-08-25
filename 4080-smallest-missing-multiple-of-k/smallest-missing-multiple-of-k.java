class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        int max = 0;
        for(int num : nums){
            set.add(num);
            max = Math.max(max,num);
        }
        int m = 1;
        int ans = 0;
        while( true ){
            int curr = k * m;
            if(!set.contains(curr)){
                ans = curr;
                break;
            }
            m++;
        }

        return ans;
    }
}