class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        double[][] position_time = new double[position.length][2];
        for (int i = 0; i < position.length; i++) {
            position_time[i][0] = position[i];
            position_time[i][1] = (double)(target - position[i]) / speed[i];
        }
        Arrays.sort(position_time, (a, b) -> Double.compare(b[0], a[0]));
        int fleet = 0;
        double recent_time = 0.0;
        for (int i = 0; i < position_time.length;i++) {
            if (position_time[i][1] > recent_time) {
                fleet +=1;
                recent_time = position_time[i][1];
            }
            System.out.println(position_time[i][0]+"-->"+position_time[i][1]);
        }
    return fleet;
    }
}