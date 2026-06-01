class Solution {
    public int minimumCost(int[] cost) {
        int n = cost.length;
        
        if(n == 2){
            return cost[0] + cost[1];
        }
        if(n == 1){
            return cost[0];
        }
        Arrays.sort(cost);
        int sum = 0;
        int count = 0;
        for(int i = n -1;i >=0; i--){
            count++;
            if(count % 3 != 0){
                sum += cost[i];
            } 
        }

        return sum;
    }
}