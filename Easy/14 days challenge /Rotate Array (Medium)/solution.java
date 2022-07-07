public class solution {
    /*
     * Runtime: 0 ms, faster than 100.00% of Java online submissions for Rotate
     * Array.
     * Memory Usage: 58.5 MB, less than 86.98% of Java online submissions for Rotate
     * Array.
     * 
     */
    public void rotate(int[] nums, int k) {
        if (k % nums.length == 0)
            return;

        k = k % nums.length;

        reverse(nums, 0, nums.length - 1);
        reverse(nums, k, nums.length - 1);
        reverse(nums, 0, k - 1);
    }

    private void reverse(int[] arr, int i, int j) {
        while (i < j) {
            swap(arr, i++, j--); // swap 后 i++， j--
        }
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

/*
 * k = 3; nums[1,2,3,4,5,6,7]
 * 
 * nums => [1, 2, 3, | 4, 5, 6, 7]
 * nums => [7, 6, 5, | 4, 3, 2, 1] reversed
 * nums => [5, 6, 7, | 1, 2, 3, 4] reversed sperate by index k = 3
 */