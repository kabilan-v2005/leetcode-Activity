class Solution {
    public int candy(int[] ratings) {
        int n = ratings.length;
        int count[] = new int[n];

        for(int i = 0;i < n;i++){
            count[i] = 1;
        }
        // int prev = ratings[0];
        // if(prev > ratings[1]){
        //     count[0] = count[1] + 1;
        // }

        for(int i = 1;i < n;i++){
            if(ratings[i] > ratings[i - 1]){
                count[i] =  count[i - 1] + 1;
            }
        }
        for(int i = n - 2;i >=0 ;i--){
            if(ratings[i] > ratings[i + 1]){
                count[i] = Math.max(count[i], count[i + 1] + 1);
            }
        }

        // int last = ratings[n - 1];
        // if(last > ratings[n - 2]){
        //     count[n - 1] = Math.max(count[n - 1], count[n - 2] + 1);
        // }

        int sum = 0;
        for(int i = 0;i < n;i++){
            sum += count[i];
        }

        return sum;
    }
}