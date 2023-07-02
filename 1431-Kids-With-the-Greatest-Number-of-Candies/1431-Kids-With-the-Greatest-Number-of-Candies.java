class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n = candies.length;
        ArrayList<Boolean> result = new ArrayList<Boolean>(n);
        int max = largest(candies);
        for (int i = 0; i < n; i++) {
            if (candies[i] + extraCandies >= max) {
                result.add(i, true);
            } else {
                result.add(i, false);
            }
        }
        return result;
    }
    static int largest(int[] arr)
    {
        int i;
         
        // Initialize maximum element
        int max = arr[0];
         
        // Traverse array elements from second and
        // compare every element with current max
        for (i = 1; i < arr.length; i++)
            if (arr[i] > max)
                max = arr[i];
         
        return max;
    }
}