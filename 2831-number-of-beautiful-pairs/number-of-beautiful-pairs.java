class Solution {

    public int gcd(int a ,int b){
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // private int split(int num1, int num2,int c){

    //     if(num1 >= 10 && num2 < 10){
    //         checkSplit(num)
    //     }
    // }
    public int countBeautifulPairs(int[] nums) {
        int n = nums.length;
        int count = 0;
        for(int i = 0;i < n;i++){
            int val = nums[i] % 10;
            for(int j = 0;j < i;j++){
                while(nums[j] >= 10){
                    nums[j] /= 10;
                }
                if(gcd(val,nums[j]) == 1) count+=1;
                else count+=0;
                
            }
        }
        return count;
    }
}