class Solution {
    public int numIslands(char[][] grid) {
        if (grid.length == 0) {
            return 0;
        }
        int result = 0;
        for (int row=0; row < grid.length; row++) {
            for (int col=0; col < grid[0].length; col++) {
                if (grid[row][col] == '1') {
                    result++;
                    dfs(row, col, grid);
                }
            }
        }
        return result;
    }
    public void dfs(int i, int j, char[][] grid) {
        if (i < 0 || j < 0 || i >=grid.length || j >= grid[0].length || grid[i][j] == '2') {
            return;
        }
        if (grid[i][j] == '1') {
            grid[i][j] = '2';
        dfs(i-1, j, grid);
        dfs(i+1, j, grid);
        dfs(i, j-1, grid);
        dfs(i, j+1, grid);
        }
    }
}