class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<>();
        int j = 1;
        Set<Integer> set = new HashSet<>();
        
        for(int i = 0;i <nums.length;i++){
            set.add(nums[i]);
        }
        for(int i = nums[0];i <= nums[nums.length - 1];i++){
            if(!set.contains(i)){
                list.add(i);
            }
        }
        return list;
    }
}