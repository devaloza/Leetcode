class Solution {
    public String mergeAlternately(String word1, String word2) {
        int max_len = word1.length();
        StringBuilder sb = new StringBuilder();
        for (int index=0; index < max_len; index++) {
            sb.append(word1.charAt(index));
            if (index < word2.length()) {
                sb.append(word2.charAt(index));
            }
        }
        if (word1.length() < word2.length()) {
            for (int i=word1.length(); i < word2.length(); i++) {
                sb.append(word2.charAt(i));
            }
        }
        return sb.toString();
    }
}