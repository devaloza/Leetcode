class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() < 0) {
            return 0;
        }
        int result = 0;
        int start = 0;
        int end = 0;
        Set<Character> set = new HashSet<>();
        while (start < s.length() && end < s.length()) {
           if (!set.contains(s.charAt(end))) {
            set.add(s.charAt(end));
            result = Math.max(result, set.size());
            end++;
           } else {
                set.remove(s.charAt(start));
                start++;
            }
        }
        return result;
    }
}