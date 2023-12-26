class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits.isEmpty()) return result;
        HashMap<Character, String> digit_to_string = new HashMap<>();
        digit_to_string.put('2', "abc");
        digit_to_string.put('3', "def");
        digit_to_string.put('4', "ghi");
        digit_to_string.put('5', "jkl");
        digit_to_string.put('6', "mno");
        digit_to_string.put('7', "pqrs");
        digit_to_string.put('8', "tuv");
        digit_to_string.put('9', "wxyz");

        backtrack("", digits, result, digit_to_string, 0);
        return result;
    }
    private static void backtrack(String current_path, String digits, List<String> result, Map<Character, String> digit_to_string, int i) {
        if (i == digits.length()) {
            result.add(current_path);
            return;
        }
        char currentDigit = digits.charAt(i);
        String currentDigitString = digit_to_string.get(currentDigit);
        for(char c:currentDigitString.toCharArray()) {
            backtrack(current_path+c, digits, result, digit_to_string, i+1);
        }
    }
}