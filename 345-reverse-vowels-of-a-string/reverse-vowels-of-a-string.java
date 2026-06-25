class Solution {
    public String reverseVowels(String s) {
        Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        char[] c_array = s.toCharArray();
        int i = 0;
        int j = c_array.length - 1;
        while (i < j) {
            if (vowels.contains(Character.toLowerCase(c_array[i]))) {
                while (!vowels.contains(Character.toLowerCase(c_array[j]))) {
                    j--;
                }
                char c= c_array[i];
                c_array[i] = c_array[j];
                c_array[j] = c;
                j--;
            }
            i++;
        }
        return new String(c_array);
    }
}