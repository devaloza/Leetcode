class NumArray {
    private int[] psum;
    public NumArray(int[] nums) {
        this.psum = new int[nums.length +1];
        for (int i=0; i < nums.length; i++) {
            psum[i + 1] = psum[i] +nums[i];
        }
    }
    
    public int sumRange(int left, int right) {
        return this.psum[right+1] - this.psum[left];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */