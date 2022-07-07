import java.util.HashMap;

class mySolution {
    /*
     * Runtime: 2 ms, faster than 76.64% of Java online submissions for Two Sum II -
     * Input Array Is Sorted.
     * Memory Usage: 49.2 MB, less than 81.72% of Java online submissions for Two
     * Sum II - Input Array Is Sorted.
     */
    public int[] twoSum(int[] numbers, int target) {
        int low = 0;
        int high = numbers.length - 1;

        while (low < high) {
            if (numbers[low] + numbers[high] > target) {
                high--;
            } else if (numbers[low] + numbers[high] < target) {
                low++;
            } else {
                int[] arr = { low + 1, high + 1 };
                return arr;
            }
        }
        return numbers;
    }

    // same as solution
}