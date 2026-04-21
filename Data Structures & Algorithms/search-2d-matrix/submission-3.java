class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int left = 0;
        int right = (rows* cols) -1;

        while(left <= right){
            int midPoint = (left + (right - left)/2);
            int midRow = midPoint/cols;
            int midCol = midPoint%cols;

            if(matrix[midRow][midCol] == target){
                return true;
            } else {
                if(matrix[midRow][midCol] < target){
                    left = midPoint +1;
                } else{
                    right = midPoint -1;
                }
            }
        }

        return false;
    }
}
