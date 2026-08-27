class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int res[] = new int[nums.length];
        List<Integer> list = new ArrayList<>();
        for(int i = 0;i < nums.length;i++){
            // int val = nums[index[i]];
            // if(list.size() > 0)
            list.add(index[i],nums[i]);
        }
        for(int i= 0;i < nums.length;i++){
            res[i] = list.get(i);
        }
        return res;
    }
}