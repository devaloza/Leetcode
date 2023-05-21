class Solution {
    public int partitionString(String s) {
        HashSet set = new HashSet();
        int result = 1;
        for (int i = 0; i <= (s.length()- 1); i++) {
            if (set.contains(s.charAt(i))) {
                result++;
                set.clear();
            }
            set.add(s.charAt(i));
        }
        return result;
    }
}