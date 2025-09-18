class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i : nums) {
            arr.add(i);
        }

        List<List<Integer>> result = new ArrayList<>();

        while (!arr.isEmpty()) {
            Set<Integer> set = new HashSet<>();
            List<Integer> row = new ArrayList<>();

          
            for (int i = 0; i < arr.size();) {
                int val = arr.get(i);
                if (!set.contains(val)) {
                    set.add(val);
                    row.add(val);
                    arr.remove(i); 
                } else {
                    i++; 
                }
            }
            result.add(row); 
        }

        return result;
    }
}
