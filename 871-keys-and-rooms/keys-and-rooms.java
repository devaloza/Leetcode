class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] seen = new boolean[rooms.size()];
        dfs(0, rooms, seen);
        for (int i =0; i < rooms.size(); i++) {
            if (!seen[i]) return false;
        }
        return true;
    }
    public void dfs(int room, List<List<Integer>> roomList, boolean[] seen) {
        seen[room] = true;
        for (int i: roomList.get(room)) {
            if (!seen[i]) {
                dfs(i, roomList, seen);
            }
        }
    }
}