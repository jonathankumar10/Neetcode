class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        rows = len(matrix)
        cols = len(matrix[0])

        left = 0
        right = rows * cols - 1

        while(left <= right):
            midpoint = left + (right-left)//2
            midrow = midpoint//cols
            midcol = midpoint%cols

            if(target == matrix[midrow][midcol]):
                return True
            elif(target < matrix[midrow][midcol]):
                right = midpoint - 1
            else:
                left = midpoint + 1

        return False