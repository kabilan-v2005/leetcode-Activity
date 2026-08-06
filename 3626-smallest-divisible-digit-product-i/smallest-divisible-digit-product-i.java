class Solution {
    public int smallestNumber(int n, int t) {
        int ans = 0;
        for(int i = n;i <= 100;i++){
            int product = sum(i);
            if(product % t == 0){
                ans = i;
                break;
            }
        }
        return ans;
    }
    public int sum(int d){
        int p = 1;
        while(d > 0){
            int digit = d % 10;
            p *= digit;
            d/=10;
        }
        return p;
    }
}