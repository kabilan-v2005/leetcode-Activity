class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        String arr[]=new String[names.length];
        Map<Integer,String> map=new TreeMap<>(Collections.reverseOrder());
        for(int i=0;i<names.length;i++){
            map.put(heights[i],names[i]);
        }
        int idx=0;
        for(String name:map.values()){
            arr[idx++]=name;
        }
        
        return arr;
    }
}