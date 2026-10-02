class Solution:
    def climbStairs(self, n: int) -> int:
        p1=1
        p2=2
        res = 0
        if n == 1:
            return p1
        if n == 2:
            return p2
        
        for i in range(2,n):
            res = p1 + p2
            p1 = p2
            p2 = res

        return res