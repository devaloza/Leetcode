class Solution {
    
    public int maxAreaOfIsland(int[][] grid) {
        boolean[][] seen = new boolean[grid.length][grid[0].length];
        if (grid.length == 0) {
            return 0;
        }
        int result = 0;
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[0].length; col++) {
                if (grid[row][col] == 1) {
                    int totalIsland = dfs(row, col, grid, seen);
                    result = Math.max(result, totalIsland);
                }
            }
        }
        return result;
    }
    public int dfs (int i, int j, int[][] grid, boolean[][] seen) {
        if (i <0 || j < 0 || i >=grid.length || j >= grid[0].length || seen[i][j] || grid[i][j] == 0) {
            return 0;
        }
        seen[i][j] = true;
        int count =  (1+dfs(i-1, j, grid, seen) + dfs(i+1, j, grid, seen) + dfs (i, j-1, grid, seen)+dfs(i, j+1, grid, seen));
        return count;
    }
}