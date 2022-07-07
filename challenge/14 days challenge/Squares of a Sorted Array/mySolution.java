import java.util.Arrays;

//insertion sort

/*
 * Runtime: 776 ms, faster than 5.01% of Java online submissions for Squares of a Sorted Array.
  Memory Usage: 55.9 MB, less than 33.03% of Java online submissions for Squares of a Sorted Array.
 */
public class mySolution {
    public int[] sortedSquares(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
            for (int j = i; j > 0; j--) {
                if (nums[i] < nums[j]) {
                    int temp = nums[j];
                    nums[j] = nums[j - 1];
                    nums[j - 1] = temp;
                    break;
                }
            }
        }
        return nums;
    }
}
