class Solution {
    public int jump(int[] nums) {
        //  int n = nums.length;
        // int currentPos = 0;
        // int jumps = 0;

        // while (currentPos < n - 1) {
        //     int maxJump = 0;
        //     for (int j = 1; j <= nums[currentPos]; j++) {
        //         if (currentPos + j >= n - 1) {
        //             return jumps + 1;
        //         }

        //         if (currentPos + j + nums[currentPos + j] > currentPos + maxJump + nums[currentPos + maxJump]) {
        //             maxJump = j;
        //         }
        //     }
        //     currentPos += maxJump;
        //     jumps++;
        // }

        // return jumps;
        int sc = 0;
        int e = 0;
        int max = 0;
        for(int i=0; i<nums.length-1; i++) {
            max = Math.max(max, i+nums[i]);
            if( i == e ) {
                sc++;
                e = max;
            }
        }
        return sc;
    }
}