public class redo1 {
    /*
     * Runtime: 0 ms, faster than 100.00% of Java online submissions for Rotate
     * Array.
     * Memory Usage: 58.5 MB, less than 86.98% of Java online submissions for Rotate
     * Array.
     * 
     */
    public void rotate(int[] nums, int k) {
        k %= nums.length;

        reverse(nums, 0, nums.length - 1);
        reverse(nums, k, nums.length);
        reverse(nums, 0, k - 1);
    }

    public void reverse(int[] nums, int low, int high) {
        while (low < high) {
            int val = nums[low];
            nums[low] = nums[high];
            nums[high] = val;
            low++;
            high--;
        }
    }
}
