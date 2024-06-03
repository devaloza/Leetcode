class Solution {
    public int strStr(String haystack, String needle) {
        int needleLength = needle.length(), haystackLength = haystack.length();
        if (haystackLength < needleLength) return -1;
        //if (haystackLength == needleLength) return 0;
        for (int i = 0; i <= haystackLength-needleLength; i++) {
            int j;
            for (j = 0; j < needleLength; j++) {
                if (haystack.charAt(i+j) != needle.charAt(j)) {
                    break;
                }
            }
            System.out.println(i+"--"+j+"--"+needleLength);
            if (j == needleLength) {
                return i;
            }
        }
        return -1;
    }
}