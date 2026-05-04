class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length; //length of orginal matrix
        // int[][] transpose=new int[n][n];

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
         for(int k=0;k<n;k++){
                int left = 0;
                int rigth=n-1;
                while(left < rigth){
                    int temp=matrix[k][left];
                    matrix[k][left]=matrix[k][rigth];
                    matrix[k][rigth]=temp;

                    left++;
                    rigth--;
                }
            }

    

    }
}