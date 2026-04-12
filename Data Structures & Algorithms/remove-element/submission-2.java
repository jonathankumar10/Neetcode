class Solution {
        // Time complexity: O(n)
    // Space complexity: O(1)
    public int removeElement(int[] nums, int val) {
        // initialze counter to 0
        int counter = 0;

        // Iterate through the array
        for(int i = 0; i < nums.length; i++){
            // check for the values which are not the value we want to remove and we add that value to array at counter and increment counter
            if(nums[i] != val){
                nums[counter] = nums[i];
                counter++;
            }
        }

        return counter;
    }
}