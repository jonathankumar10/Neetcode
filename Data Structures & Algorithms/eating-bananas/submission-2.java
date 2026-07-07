class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = 0;
        for(int pile: piles){
            high = Math.max(high, pile);
        }
        int res = high;

        while(low <= high){
            int mid = low + (high - low)/2;
            long timeTaken = 0;
            for(int pile: piles){
                timeTaken += (pile + mid - 1L) / mid; 
            }

            if(timeTaken <= h){
                res = mid;
                high = mid -1;
            }
            else if (timeTaken > h){
                low = mid + 1;
            }
        }

        return res;
    }
}


// piles[i] -> number of bananas

// h -> number of hours to eat all bananas

// eating rate = max(piles[i])/9