class Solution {
    public int strStr(String haystack, String needle) {
        if (haystack.length() < 1 || needle.length() < 1 || (haystack.length() < needle.length() )) {
            return -1;
        }
        int l1 = haystack.length();
        int l2 = needle.length();
    for (int i = 0; i < l1-l2+1; i++) {
        int count = 0;
        while (count < l2 && haystack.charAt(i+count) == needle.charAt(count))
            count++;
        if (count == l2)
            return i;
    }
        return -1;
    }
}