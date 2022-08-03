class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List> map = new HashMap<String, List>();
        for (String str : strs) {
            String key = getKey(str);
            if (!map.containsKey(key)) {
                List<String> list = new ArrayList<String>();
                list.add(str);
                map.put(key, list);
            } else {
                map.get(key).add(str);
            }
        }
        return new ArrayList(map.values());
    }
    private String getKey(String str) {
        int[] map = new int[26];
        char[] chararr = str.toCharArray();
        for (char c:chararr ) {
            map[c - 'a']++;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            sb.append("#");
            sb.append(map[i]);
        }
    return sb.toString();
    }
}