class mySolution {
    /*
     * Runtime: 1 ms, faster than 99.92% of Java online submissions for Reverse
     * String.
     * Memory Usage: 49.4 MB, less than 87.84% of Java online submissions for
     * Reverse String.
     */
    public void reverseString(char[] s) {
        int low = 0;
        int high = s.length;

        while (low < high) {
            char val = s[low];
            s[low] = s[high];
            s[high] = val;
        }
    }
}