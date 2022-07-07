public class mySolution {
    /*
     * Runtime: 2 ms, faster than 79.54% of Java online submissions for Move Zeroes.
     * Memory Usage: 54.8 MB, less than 51.64% of Java online submissions for Move
     * Zeroes.
     */
    public void moveZeroes(int[] nums) {
        int j = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int val = nums[i];
                nums[i] = nums[j];
                nums[j] = val;
                j++;
            }
        }
    }
}