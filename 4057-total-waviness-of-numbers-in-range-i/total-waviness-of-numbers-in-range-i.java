class Solution {
    public int totalWaviness(int num1, int num2) {
        int total = 0;
        for(int i = num1;i <= num2;i++){
            total += waviness(i);
        }
        return total;
    }
    int waviness(int x){
        String s = Integer.toString(x);
        int n = s.length();
        int tot_waviness = 0;

        for(int i = 1; i < n - 1 ;i++){
            boolean isPeak = s.charAt(i) < s.charAt(i - 1) && s.charAt(i) < s.charAt(i + 1);
            boolean isValley = s.charAt(i) > s.charAt(i - 1) && s.charAt(i) > s.charAt(i + 1);
            if(isPeak || isValley){
                tot_waviness++;
            }
        }
        return tot_waviness;
    }
}