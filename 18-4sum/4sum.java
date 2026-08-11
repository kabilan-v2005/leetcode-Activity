class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> mainList = new ArrayList<>();
        for(int i = 0;i < nums.length;i++){
            if(i > 0 && nums[i] == nums[i - 1]){
                continue;
            }
            for(int j = i + 1;j < nums.length - 2;j++){

                if(j > i + 1 && nums[j] == nums[j - 1]) continue;

                int l = j + 1;
                int r = nums.length - 1;

                while(l < r){
                    List<Integer> list = new ArrayList<>();
                    long sum = (long) nums[i] + nums[j] + nums[l] + nums[r];
                    // boolean b = false;
                    if(sum == target){
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[l]);
                        list.add(nums[r]);
                        mainList.add(list);
                    
                    // if(b) mainList.add(list);
                    while (l < r && nums[l] == nums[l + 1]) {
                        l++;
                    }
                    
                    l++;
                    while (l < r && nums[r] == nums[r - 1]) {
                        r--;
                    }
                    
                    r--;
                    }
                    if(sum < target) l++;
                    else if(sum > target) r--;

                }
            }
        }
        return mainList;
    }
}