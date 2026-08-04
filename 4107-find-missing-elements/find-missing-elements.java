class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        // Arrays.sort(nums);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i : nums){
            min = Math.min(i,min);
            max = Math.max(i,max);
        }
        List<Integer> list = new ArrayList<>();
        
        Set<Integer> set = new HashSet<>();
        
        for(int i = 0;i <nums.length;i++){
            set.add(nums[i]);
        }
        for(int i = min;i <= max;i++){
            if(!set.contains(i)){
                list.add(i);
            }
        }
        return list;
    }
}