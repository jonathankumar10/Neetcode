class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int left = 0;
        int right = (rows * cols) -1;

        while(left <= right){
            int midpoint = left + (right - left)/2;
            int midrow = midpoint/cols;
            int midcol = midpoint%cols;

            if(target == matrix[midrow][midcol]){
                return true;
            }
            else if(target < matrix[midrow][midcol]){
                right = midpoint -1;
            }
            else {
                left = midpoint + 1;
            }
        }
        return false;
    }
}
