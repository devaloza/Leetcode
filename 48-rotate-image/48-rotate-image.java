class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int layers = n/2;
        for (int i = 0; i < layers; i ++) {
            int start = i;
            int end = n-i-1;
            for (int j = start; j < end; j ++) {
                // top in temp
                int temp = matrix[start][j];
                // left bottom into left top
                matrix[start][j] = matrix[n-j-1][start];
                // right bottom into left bottom 
                matrix[n-j-1][start] = matrix[end][n-j-1];
                // right top into right bottom
                matrix[end][n-j-1] = matrix[j][end];
                // temp into top right
                matrix[j][end] = temp;
            }
        }
    }
}