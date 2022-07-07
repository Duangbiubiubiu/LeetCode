public class mySolution {
    // 这个可以，但是runtime 太大， 所以leetcode time exceed了

    public void rotate(int[] nums, int k) {
        int i = 0;
        k = k % nums.length;
        while (i < k) {
            int val = nums[nums.length - 1];

            for (int j = nums.length - 1; j > 0; j--) {
                nums[j] = nums[j - 1];
            }
            nums[0] = val;
            i++;
        }

        for (int w : nums)
            System.out.print(w);
    }
}