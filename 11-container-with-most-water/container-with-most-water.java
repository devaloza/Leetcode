class Solution {
    public int maxArea(int[] height) {
        int area = 0;
        int start = 0;
        int end = height.length -1;
        while (start <= end) {
            int distance = end - start;
            area = Math.max(area, distance * Math.min(height[start], height[end]));
            if (height[start] > height[end]) {
                end--;
            } else {
                start++;
            }
        }
        return area;
    }
}