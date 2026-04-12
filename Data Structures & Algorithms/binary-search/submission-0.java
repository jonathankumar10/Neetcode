class Solution {

    // Time complexity: O(logn)
    // Spacen complexity: O(logn)
    public int search(int[] nums, int target) {
        // initialize left and right pointers
        int left = 0;
        int right = nums.length-1;
        // iterate through the list till left is less than or equal to right
        while(left<=right){
            // Calculate midepoint
            int mid = left + (right - left)/2;

            // if value at midpoint is equal to target return index(mid)
            if(nums[mid] == target){
                return mid;
            }
            else{
                // if value at mid is less than target set left to mid + 1 else set right to mid -1
                if(nums[mid]<target){
                    left = mid+1;
                }
                else if(nums[mid]> target){
                    right = mid-1;
                }
            }
        }
        // if it does not exist return -1
        return -1;
    }
}