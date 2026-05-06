class Solution {
    public int[][] generateMatrix(int n) {
        int row_start = 0;
        int row_end = n - 1;
        int col_start = 0;
        int col_end = n-1;

        int result[][] = new int[n][n];

        int i=1;
        while(row_start <= row_end && col_start <= col_end){
            for(int k = col_start;k <=col_end;k++){
                result[row_start][k] = i;
                i++;
            }
            row_start++;

            for(int k = row_start;k <= row_end;k++){
                result[k][col_end] = i;
                i++;
            }
            col_end--;

            for(int k = col_end;k >= col_start;k--){
                result[row_end][k] = i;
                i++;
            }
            row_end--;

            for(int k = row_end;k >= row_start;k--){
                result[k][col_start] = i;
                i++;
            }
            col_start++;
        }

        return result;
    }
}