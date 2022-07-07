import java.util.Arrays;

/*Runtime: 8 ms, faster than 29.80% of Java online submissions for Squares of a Sorted Array.
Memory Usage: 56 MB, less than 19.49% of Java online submissions for Squares of a Sorted Array.
 */
public class mySolution2 {
    public int[] sortedSquares(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }
}
