class Solution {
    public int findCircleNum(int[][] isConnected) {
       int numOfCities = 0;
       boolean[] visit = new boolean[isConnected.length];
       for (int i =0; i<isConnected.length; i++) {
            if (!visit[i]) {
                numOfCities++;
                dfs(i, isConnected, visit);
            }
       }
       return numOfCities;
    }
    public void dfs(int node, int[][] isConnected, boolean[] visit) {
        visit[node] = true;
        for (int i=0;i< isConnected.length; i++) {
            if (isConnected[node][i] == 1 && !visit[i]) {
                    dfs(i, isConnected, visit);
            }
        }
    }
}