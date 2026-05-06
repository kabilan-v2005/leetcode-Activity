class Solution {
    public char[][] rotateTheBox(char[][] boxGrid) {

        int m = boxGrid.length;
        int n = boxGrid[0].length;

        // rotated matrix
        char[][] result = new char[n][m];

        // rotate 90° clockwise
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result[j][m - 1 - i] = boxGrid[i][j];
            }
        }

        // apply gravity
        for (int col = 0; col < m; col++) {

            int low = n - 1;

            for (int row = n - 1; row >= 0; row--) {

                if (result[row][col] == '#') {
                    result[row][col] = '.';
                    result[low][col] = '#';
                    low--;
                }

                if (result[row][col] == '*') {
                    low = row - 1;
                }
            }
        }

        return result;
    }
}