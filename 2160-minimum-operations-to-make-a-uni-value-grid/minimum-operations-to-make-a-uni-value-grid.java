class Solution {
    public int minOperations(int[][] grid, int x) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int[] r:grid){
            for(int c:r){
                list.add(c);
            }
        }

        int mod=list.get(0) % x;
        for(int i:list){
            if(i % x != mod) return -1;
        }

        Collections.sort(list);
        int med=list.get(list.size()/2);
        int op=0;
        for(int val:list){
            op+=Math.abs(val-med) / x;
        }
        return op;
    }
}