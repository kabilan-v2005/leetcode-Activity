class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();

        for(int num : nums1){
            list.add(num);
        }
        List<Integer> res = new ArrayList<>();
        for(int n : nums2){
            if(list.contains(n)) res.add(n);
            list.remove(Integer.valueOf(n));
        }
        int ans[] = new int[res.size()];
        for(int i = 0;i < res.size();i++){
            ans[i] = res.get(i);
        }

        return ans;
    }
}