class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(res,new ArrayList<>(),new boolean[nums.length],nums);
        return res;
    }
    void backtrack(List<List<Integer>> res,ArrayList<Integer> list,boolean vis[],int nums[]){

        if(list.size() == nums.length && !res.contains(list)){
            res.add(new ArrayList<>(list));
            return;
        }

        for(int i = 0;i < nums.length;i++){
            if(vis[i]) continue;
            
            if (i > 0 && nums[i] == nums[i - 1] && !vis[i - 1]) {
                continue;
            }

            vis[i] = true;
            
            list.add(nums[i]);
            backtrack(res,list,vis,nums);

            vis[i] = false;

            list.remove(list.size() - 1);
        }
    }
}