class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        rows = len(matrix)
        cols = len(matrix[0])

        left = 0
        right = (rows * cols) -1

        while(left<=right):
            midPoint = left + (right - left)//2
            midRow = midPoint//cols
            midCol = midPoint%cols

            if(matrix[midRow][midCol] == target):
                return True
            elif(matrix[midRow][midCol]< target):
                left = midPoint + 1
            else:
                right = midPoint -1
        
        return False