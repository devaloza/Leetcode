class Solution {
    public int minMeetingRooms(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));
        PriorityQueue<Integer> min_heap = new PriorityQueue<>();
        min_heap.add(intervals[0][1]);
        for (int i=1; i<intervals.length; i++) {
            if (intervals[i][0] >= min_heap.peek()) {
                min_heap.poll();
            }
            min_heap.add(intervals[i][1]);
        }
        return min_heap.size();
    }
}