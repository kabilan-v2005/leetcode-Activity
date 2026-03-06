class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);
        // int count=0;
        // for(int i=0;i<students.length;i++){
        //     if(students[i]==seats[i]) count=count;
        //     while(seats[i]!=students[i]){
        //         if(students[i]<seats[i]){
        //             students[i]+=1;
        //             count++;
        //         }
        //         else{
        //             students[i]-=1;
        //             count++;
        //         }
        //     }
        // }
        // return count;
        int sum=0;
        for(int i=0;i<students.length;i++){
            sum+=Math.abs(seats[i]-students[i]);
        }
        return sum;
    }
}