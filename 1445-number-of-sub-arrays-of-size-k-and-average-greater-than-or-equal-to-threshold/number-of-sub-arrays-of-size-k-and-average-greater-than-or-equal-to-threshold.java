class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int count=0;

        int currentsum=0;
        for(int i=0;i<k;i++){
            currentsum+=arr[i];
        }
        int avg=currentsum/k;
        if(avg>=threshold){
           count++;
        }
        for(int i=k;i<arr.length;i++){
            currentsum=currentsum-arr[i-k]+arr[i];
            avg=currentsum/k;

            if(avg>=threshold){
            count++;
        }
        }

        return count;
    }
}