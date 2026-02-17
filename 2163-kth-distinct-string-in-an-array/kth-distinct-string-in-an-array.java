class Solution {
    public String kthDistinct(String[] arr, int k) {
        Map<String,Integer> map=new HashMap<>();
        for(String i:arr){
            map.put(i,map.getOrDefault(i, 0)+1);
        }
        int count=0;
        for(String n:arr){
            if(map.get(n)==1) count++;
            if(count==k) return n;
        }
        return "";
    }
}