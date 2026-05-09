class Solution {
    public int[][] rotateGrid(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        int layer = Math.min(m, n) / 2;

        for(int l = 0;l < layer;l++){
            List<Integer> list = new ArrayList<>();
            int left = l, right = n - l - 1;
            int top = l, bottom = m - l - 1;

            for(int j = left;j<right;j++)
                list.add(grid[top][j]);
            
            for(int i = top;i< bottom;i++)
                list.add(grid[i][right]);

            for(int j = right;j > left;j--)
                list.add(grid[bottom][j]);

            for(int i= bottom;i > top;i--)
                list.add(grid[i][left]);
    
            int len = list.size();
            int shift = k % len;
            Collections.rotate(list, -shift);

            int idx=0;

            for (int j = left; j < right; j++)
                grid[top][j] = list.get(idx++);

            for (int i = top; i < bottom; i++)
                grid[i][right] = list.get(idx++);

            for (int j = right; j > left; j--)
                grid[bottom][j] = list.get(idx++);

            for (int i = bottom; i > top; i--)
                grid[i][left] = list.get(idx++);

        }

        return grid;
        
    }
}