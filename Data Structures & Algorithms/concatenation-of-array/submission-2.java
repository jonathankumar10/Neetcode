class Solution {

    // Time complexity: O(n)
    // Space complexity: O(n)
    public int[] getConcatenation(int[] nums) {
        // Instantiate a new array with twice the length og the inital array as we are concatenating the orignal array
        int[] ans = new int[nums.length * 2];

        // Iterate through the array
        for(int i = 0; i < nums.length; i++){
            // Add nums value of i at ans[i] and ans[nums.length + 1] positions
            ans[i] = nums[i];
            ans[nums.length+i] = nums[i];
        }

        return ans;
    }
}
