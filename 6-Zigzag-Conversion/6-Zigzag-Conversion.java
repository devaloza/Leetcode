class Solution {
    public String convert(String s, int numRows) {
        if (numRows ==1) return s;
        int increment = 2*(numRows - 1);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            for (int r = i; r < s.length(); r+=increment) {
                sb.append(s.charAt(r));
                //System.out.println(i+"--"+r);
                if (i > 0 && i < numRows -1 && ((r + increment -2*i) < s.length())) {
                    sb.append(s.charAt(r + increment -2*i));
                }
            }
        }
        return sb.toString();
    }
}