class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        HashMap<String, Boolean> opt = new HashMap<>();
        String emptyStr = "";
        opt.put(emptyStr, true);
        Set<String> hSet = new HashSet<String>(wordDict);
        boolean returnVal = wordBreakHelper(s, hSet, opt);
        System.out.println(opt);
        return returnVal;
    }
    private static boolean wordBreakHelper(String s, Set<String> wordDist,  HashMap<String, Boolean> opt) {
        System.out.println(s);
        if (opt.containsKey(s)) {
            return opt.get(s);
        }
        boolean segment  = false;
        for (int i = 1; i<s.length() + 1; i++) {
            String substr = s.substring(0, i);
            // System.out.println("substr = " + substr);
            if (wordDist.contains(substr)) {
                // System.out.println("sub = " + s.substring(i));
                boolean val = wordBreakHelper(s.substring(i), wordDist, opt);
                if (val == true) {
                    segment = true;
                    break;
                }
            }
        }
        opt.put(s, segment);
        return segment;
    }
}