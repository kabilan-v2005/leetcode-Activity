class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        Queue<Integer> q = new ArrayDeque<>();

        for(int i = 0;i < tickets.length;i++){
            q.add(i);
        }

        int time = 0;
        while(!q.isEmpty()){
            
            int currentpos = q.poll();
            
            tickets[currentpos]--;
            time++;


            if(currentpos == k && tickets[k] == 0){
                return time;
            }
            if( tickets[currentpos] > 0 )
                q.add(currentpos);

        }

        return time;
    }
}