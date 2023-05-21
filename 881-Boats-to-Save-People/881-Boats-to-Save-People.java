class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int start = 0;
        int end = people.length - 1;
        int boat = 0;
        int remain = 0;
        while (start <= end) {
            remain = limit - people[end];
            boat++;
            end--;
            if (remain >= people[start]) {
                start++;
            }
        }
        return boat;
    }
}