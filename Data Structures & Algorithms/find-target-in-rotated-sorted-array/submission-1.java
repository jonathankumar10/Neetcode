class Solution {
    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length -1;
        int pivot;
        while(l<r){
            int m = l + (r-l)/2;
            if(nums[r]>nums[m]){
                r = m;
            }
            else{
                l = m +1;
            }
        }

        pivot = l;

        if(target >= nums[pivot] && target <= nums[nums.length - 1]){
            return binarySearch(nums, pivot, nums.length - 1, target);
        } else {
            return binarySearch(nums, 0, pivot - 1, target);
        }
    }
    private int binarySearch(int[] nums, int left, int right, int target) {

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }
}
