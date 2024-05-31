class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        Arrays.sort(strs);
        String start = strs[0];
        for (int i =1; i < strs.length; i++) {
            int j = 0;
            while (j < start.length() && start.charAt(j) == strs[i].charAt(j)) {
                j++;
            }
            start = start.substring(0, j);
            if (start.isEmpty()) {
                break;
            }
        }
        return start;
    }
}