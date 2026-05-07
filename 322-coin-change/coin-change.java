class Solution {
    public int coinChange(int[] coins, int amount) {
        if(amount < 1) return 0;
        // dp --> memo
        int dp[] = new int[amount+1];

        for(int i = 1;i <= amount;i++){
            dp[i] = Integer.MAX_VALUE;
            // try each coin 
            for(int coin : coins){
                // iterate for find min coins to achive amount from 1 - 11,
                // and add needed min coin to dp[] --> memo
                if(coin <= i && dp[i - coin] != Integer.MAX_VALUE){
                    dp[i] = Math.min(dp[i] , 1 + dp[i - coin]);
                }
            }
        }
        // if the amount does not formed by the coins return -1
        if(dp[amount] == Integer.MAX_VALUE) return -1;

        return dp[amount];
    }
}