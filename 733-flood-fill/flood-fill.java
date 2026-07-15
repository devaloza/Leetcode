class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int original_colour = image[sr][sc];
        if (original_colour == color) {
            return image;
        }
        dfs(image,sr,sc,color,original_colour);
        
        return image;
    }
    public void dfs(int[][] image, int row, int col, int color, int original_color) {
        if (row < 0 || col < 0 || row >= image.length || col >= image[0].length) {
            return;
        }
        if (image[row][col] != original_color) {
            return;
        }
        image[row][col] = color;
        dfs(image, row-1,col,color,original_color);
        dfs(image, row+1,col,color,original_color);
        dfs(image, row,col-1,color,original_color);
        dfs(image, row,col+1,color,original_color);
    }
}