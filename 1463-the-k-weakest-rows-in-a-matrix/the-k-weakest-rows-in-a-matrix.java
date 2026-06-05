class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int m = mat.length;
        int arr[][] = new int[m][2];

        for(int i = 0;i < m;i++){
            int count = 0;
            int n = mat[i].length;
            for(int j = 0;j < n;j++){
                if(mat[i][j] == 1){
                    count++;
                }
            }
            arr[i][0] = count;
            arr[i][1] = i; 
        }
        Arrays.sort(arr, (a, b) -> {
            if (a[0] == b[0]) {
                return a[1] - b[1];
            }
            return a[0] - b[0];
        });
        int ans[] = new int[k];
        for(int i = 0;i < k;i++){
            ans[i] = arr[i][1];
        }
        return ans;
    }
}