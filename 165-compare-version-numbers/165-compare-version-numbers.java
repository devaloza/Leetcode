class Solution {
    public int compareVersion(String version1, String version2) {
        String[] s1 = version1.split("\\.");
        String[] s2 = version2.split("\\.");
        int maxLen = Math.max(s1.length, s2.length);
        int s1Len = s1.length;
        int s2Len = s2.length;
        for (int i=0; i< maxLen; i++) {
            int n1 = (i < s1Len) ? Integer.parseInt(s1[i]) : 0;
            int n2 = (i < s2Len) ? Integer.parseInt(s2[i]) : 0;
            if (n1 > n2) {
                return 1;
            } else if (n1 < n2) {
                return -1;
            }
        }
        return 0;
    }
}