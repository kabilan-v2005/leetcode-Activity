class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        boolean res=false;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i:arr){
            map.put(i,map.getOrDefault(i, 0)+1);
        }
        HashSet<Integer> set=new HashSet<>();
        for(Integer i:map.keySet()){
            int value=map.get(i);
            if(set.contains(value))return false;
            set.add(value);
        }
        return true;
    }
}