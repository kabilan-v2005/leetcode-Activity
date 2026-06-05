class Solution {
    private int countSoldiers(int row[]){
        int left = 0;
        int rigth = row.length - 1;
        while(left <= rigth){
            int mid = left + (rigth - left) / 2;
            if(row[mid] == 1) left = mid + 1;
            else rigth = mid - 1;
        }
        return left;
    }
    public int[] kWeakestRows(int[][] mat, int k) {
        int m = mat.length;
        int arr[][] = new int[m][2];
        // int flag = 0;

        for(int i = 0;i < m;i++){
            // int count = 0;
            // int n = mat[i].length;
            // for(int j = 0;j < n;j++){
            //     // if(mat[i][j] == 0){
            //     //     break;
            //     // }
            //     // else{
            //     //     count++;
            //     // }
            // }

            arr[i][0] = countSoldiers(mat[i]);;
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