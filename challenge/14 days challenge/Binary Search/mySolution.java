public class mySolution {
    public int search(int[] nums, int target) {
        int mid = nums.length / 2;
        int low = 0;
        int high = nums.length -1;

        while(low <= high) {
            if(nums[mid] > target) {
                high = mid - 1;
                mid = (high - low) / 2 + low;
            }
            else if (nums[mid] < target) {
                low = mid + 1;
                mid = (high - low) / 2 + low;
            }
            else if (nums[mid] == target){
                return mid;
            }
            else{
                return low;
            }
        }
        return -1;

    }
}
