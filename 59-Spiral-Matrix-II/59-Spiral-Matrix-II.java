class Solution {
    public int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        //int[][] res;
        if (n == 1) {
           // return res[0][0] = n;
        }
        int top = 0;
        int bottom = n-1;
        int left = 0;
        int right = n-1;
        int j = 1;
        while(true){
            for(int i = left; i <= right; i++) res[top][i] = j++;
            top++;
            if(left > right || top > bottom) break;
            
            for(int i = top; i <= bottom; i++) res[i][right] = j++;
            right--;
            if(left > right || top > bottom) break;
            
            for(int i = right; i >= left; i--) res[bottom][i]= j++;
            bottom--;
            if(left > right || top > bottom) break;
            
            for(int i = bottom; i >= top; i--) res[i][left]= j++;
            left++;
            if(left > right || top > bottom) break;
        }
        return res;
    }
}