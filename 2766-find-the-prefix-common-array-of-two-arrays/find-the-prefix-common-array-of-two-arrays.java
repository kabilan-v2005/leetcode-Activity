class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n = A.length;

        int arr[] = new int[n];

        Set<Integer> a = new HashSet<>();
        Set<Integer> b = new HashSet<>();
        int count = 0;
        for(int i =0;i<n;i++){
            a.add(A[i]);
            b.add(B[i]);
            if(a.contains(B[i]) && (A[i]!=B[i])){
                count++;
            }
            if(b.contains(A[i])){
                count++;
            }
            arr[i] = count;
            
        }
        return arr;
    }
}