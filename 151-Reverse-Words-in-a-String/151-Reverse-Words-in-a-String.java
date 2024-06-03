class Solution {
    public String reverseWords(String s) {
        // Convert string to char array
        char[] charArray = s.toCharArray();

        // Reverse the entire string
        reverse(charArray, 0, charArray.length - 1);

        // Reverse each individual word
        int start = 0;
        for (int end = 0; end < charArray.length; end++) {
            if (charArray[end] == ' ') {
                reverse(charArray, start, end - 1);
                // Skip multiple consecutive spaces
                while (end < charArray.length - 1 && charArray[end + 1] == ' ') {
                    end++;
                }
                start = end + 1;
            }
        }

        // Reverse the last word (if any)
        reverse(charArray, start, charArray.length - 1);

        // Convert char array back to string and return
        return cleanSpaces(charArray);
    }
    private String cleanSpaces(char[] arr) {
        int slow = 0, fast = 0;
        while (fast < arr.length) {
            // Skip spaces
            while (fast < arr.length && arr[fast] == ' ') {
                fast++;
            }
            // Copy non-space characters
            while (fast < arr.length && arr[fast] != ' ') {
                arr[slow++] = arr[fast++];
            }
            // Skip spaces
            while (fast < arr.length && arr[fast] == ' ') {
                fast++;
            }
            // Add a single space if more words are remaining
            if (fast < arr.length) {
                arr[slow++] = ' ';
            }
        }
        return new String(arr).substring(0, slow);
    }
    private void reverse(char[] arr, int start, int end) {
        while (start < end) {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}