class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();

        for(int i : nums2){
            set.add(i);
        }

        for(int i = 0;i < nums1.length;i++){
            if(set.contains(nums1[i])){
                return nums1[i];
            }
        }
        return -1;
    }
}