class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() < 0) {
            return 0;
        }
        int result = 0;
        int start = 0;
        int end = 0;
        Map<Character, Integer> char_frequency = new HashMap<>();
        while (start < s.length() && end < s.length()) {
            char c = s.charAt(end);
           char_frequency.put(s.charAt(end), char_frequency.getOrDefault(s.charAt(end), 0) +1);
           while (char_frequency.get(c) > 1) {
            char st = s.charAt(start);
            char_frequency.put(st, char_frequency.get(st) -1);
            start++;
           }
           result = Math.max(result, end - start +1);
           end++;
        }
        return result;
    }
}