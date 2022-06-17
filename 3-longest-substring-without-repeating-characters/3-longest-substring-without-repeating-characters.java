class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length()==0 || s == null) {
            return 0;
        }
        int i = 0;
        int j = 0;
        int max = 0;
        Set<Character> set = new HashSet<Character>();
        while (i < s.length()) {
            char c = s.charAt(i);
           // System.out.println(c);
            while (set.contains(c)) {
                set.remove(s.charAt(j));
                ++j;
            }
            set.add(c);
            //System.out.println(Arrays.toString(set.toArray()));
            max = Math.max(max, i-j+1);
             ++i;
            //System.out.println(max);
        }
        return max;
    }
}