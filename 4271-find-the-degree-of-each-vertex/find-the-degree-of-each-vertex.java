class Solution {
    public int[] findDegrees(int[][] matrix) {
        int arr[]=new  int[matrix.length];
        // if(matrix.length<=1) {
        //     arr[0]=0;
        //     return arr;
        // }
        for(int i=0;i<matrix.length;i++){
            int v1=0;
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==1) v1++;
            }
            arr[i]=v1;
        }
        return arr;
    }
}