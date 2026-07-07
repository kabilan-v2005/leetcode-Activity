class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0) + 1);
        }
        int arr[] = new int[k];
         List<Map.Entry<Integer, Integer>> list = map.entrySet()
                .stream()
                .sorted((a, b) -> b.getValue() - a.getValue())
                .collect(Collectors.toList());

        int[] ans = new int[k];

        // Pick first k keys
        for (int i = 0; i < k; i++) {
            ans[i] = list.get(i).getKey();
        }
        return ans;
    }
}