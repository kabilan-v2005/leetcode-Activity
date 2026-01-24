class Solution {
    public int totalMoney(int n) {
        int count=0;
        int weekstart=1;
        int day=1;
        for(int i=1;i<=n;i++){
            count+=day;
            
            if(i%7==0){
                weekstart++;
                day=weekstart;
            }
            else
                day++;
        }
        return count;
    }
}