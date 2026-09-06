class Solution:
    def minEatingSpeed(self, piles: List[int], h: int) -> int:
        left = 1
        right = max(piles)
        result = right

        while(left <= right):

            rate = left + (right - left)//2
            totalTime = 0;

            for pile in piles:
                totalTime += math.ceil(float(pile)/rate)
            

            if(totalTime <= h):
                result =  rate
                right = rate - 1
            else:
                left = rate + 1

        return result