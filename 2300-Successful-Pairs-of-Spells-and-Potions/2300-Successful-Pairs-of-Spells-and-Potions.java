class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int[] pairs = new int[spells.length];
        Arrays.sort(potions);
        int i=0;
        for (int spell : spells) {
            int index = potions.length;
            int start = 0; int end = potions.length -1;
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (((spell*1L) * (potions[mid]*1L)) >= success) {
                    end = mid - 1;
                    index = mid;
                } else {
                    start = mid + 1;
                }
            }
            pairs[i] = (potions.length - index);
            i++;
        }
        return pairs;
    }
}