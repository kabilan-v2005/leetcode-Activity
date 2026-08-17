class Solution {
    int sum = 0;
    public int subsetXORSum(int[] nums) {
        sum = 0;
        // List<List<Integer>> = new ArrayList<>();
        backtrack(nums,0,new ArrayList<>());
        return sum;
    }

    void backtrack(int[] nums,int start,List<Integer> list){
            // res.add(new ArrayList<>(list));
        xor(list);

        for(int i = start;i < nums.length;i++){
            list.add(nums[i]);
            backtrack(nums, i + 1, list);
            list.remove(list.size() - 1);
        }

    }
    void xor(List<Integer> list){
        int val = 0;
        for(int i = 0;i < list.size();i++){
            val ^= list.get(i);
        }
        sum += val;
    }
}