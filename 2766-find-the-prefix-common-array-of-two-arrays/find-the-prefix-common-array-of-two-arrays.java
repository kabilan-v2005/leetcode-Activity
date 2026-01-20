class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {

        Set<Integer> setA = new HashSet<>();
        Set<Integer> setB = new HashSet<>();

        int n = A.length;
        int[] C = new int[n];
        int count = 0;

        for (int i = 0; i < n; i++) {

            setA.add(A[i]);
            setB.add(B[i]);

         
            if (setA.contains(B[i]) && setB.contains(B[i])) {
                count++;
            }

            if (A[i] != B[i] && setA.contains(A[i]) && setB.contains(A[i])) {
                count++;
            }

            C[i] = count;
        }
        return C;
    }
}
