class Solution {
    public int lengthOfLastWord(String s) {
        int max = 0;
        for (int i = s.length()-1; i >=0; i--) {
            if (s.charAt(i) !=' ') {
                max++;
            } else {
                if (max > 0) return max;
            }
        }
        return max;
    }
}