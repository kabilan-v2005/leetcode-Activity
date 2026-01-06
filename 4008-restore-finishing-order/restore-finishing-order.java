class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        Set<Integer> set = new HashSet<>();
        for (int f : friends) {
            set.add(f);
        }
        int arr[]= new int[friends.length];
        int index=0;
        for(int i=0;i<order.length;i++){
            
            if(set.contains(order[i])){
                arr[index++]=order[i];
            }
        }
    return arr;
    }
}