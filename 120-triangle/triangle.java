class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        Integer[][] memo = new Integer[n][n]; // memoization table
        return helper(triangle, 0, 0, memo);
    }

    // Recursive helper function
    private int helper(List<List<Integer>> tri, int row, int col, Integer[][] memo) {
        // Base case: last row
        if (row == tri.size() - 1) {
            return tri.get(row).get(col);
        }

        // Check memo
        if (memo[row][col] != null) return memo[row][col];

        // Recursive calls: down and down-right
        int down = helper(tri, row + 1, col, memo);
        int downRight = helper(tri, row + 1, col + 1, memo);

        // Store and return result
        memo[row][col] = tri.get(row).get(col) + Math.min(down, downRight);
        return memo[row][col];
    }
}