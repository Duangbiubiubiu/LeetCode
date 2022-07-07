import java.util.HashSet;
import java.util.Iterator;
import java.lang.Math;

class mySolution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                set.add(nums[i]);
                continue;
            } else if (nums[i] % 10 == 0) {
                nums[i] = 1;
            } else if (nums[i] >= 10) {
                nums[i] %= 10;
            }
        }
        int count = 1;
        int val = 0;
        for (Integer i : set) {
            if (i - val == 1) {
                count++;
            } else {
                count = 0;
            }
        }

        return count + 1;
    }
}