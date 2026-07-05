class Solution {
    public int[][] sortTheStudents(int[][] score, int k) {
        // int row = score[0].length;
        int row = score.length;
        int col = score[0].length;
        for(int i = 0;i < row;i++){
            int max = Integer.MIN_VALUE;
            int idx = i;
            int max_row_idx = i;
            while(idx < row){
                if(score[idx][k] > max){
                    max = score[idx][k];
                    max_row_idx = idx;
                }
                idx++;
            }
            for(int j = 0;j < col;j++){
                int temp = score[i][j];
                score[i][j] = score[max_row_idx][j];
                score[max_row_idx][j] = temp;
            }
        }
        return score;
    }
}