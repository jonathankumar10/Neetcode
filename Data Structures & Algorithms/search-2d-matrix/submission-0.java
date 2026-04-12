class Solution {
    // Time complexity: O(log n * m)
    // Space complexity: O(1)
    public boolean searchMatrix(int[][] matrix, int target) {
        // Initialize rows and cols
        int rows = matrix.length;
        int cols = matrix[0].length;

        // initialze left and right pointers
        int left = 0;
        int right = (rows * cols) -1;

        // iterate till left is greater than right
        while(left<= right){

            // calculate midpoint and also its respective row and col of that midpoint
            int mid = left + (right - left)/2;
            // "/" gives you the "how many complete groups" part → the group number
            // "%" gives you the "leftover" part → position within the group
            int r = mid/cols;
            int c = mid%cols;

            // if value at that point is equal to target return true
            if(matrix[r][c] == target){
                return true;
            }
            else{
                // if value at mid is less than target set left to mid + 1 else set right to mid
                // -1
                if(matrix[r][c] < target){
                    left = mid +1;
                }
                else if(matrix[r][c] > target){
                    right = mid -1;
                }
            }
        }
        // if it does not exist return false
        return false;
    }
}