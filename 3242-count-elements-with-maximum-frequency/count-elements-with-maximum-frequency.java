class Solution {
    public int maxFrequencyElements(int[] nums) {
    
        Map<Integer, Integer> map = new HashMap<>();
        
       
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int max=0;
        for(int i:map.values()){
            if(i>max)
                max=i;
        }
        int total=0;
        for(int i:map.values()){
            if(i==max)
                total+=i;
        }

       
        return total;
    }
}