// Koko loves to eat bananas. There are n piles of bananas, the ith pile has piles[i] bananas. The guards have gone and will come back in h hours.

// Koko can decide her bananas-per-hour eating speed of k. Each hour, she chooses some pile of bananas and eats k bananas from that pile.
// If the pile has less than k bananas, she eats all of them instead and will not eat any more bananas during this hour.

// Koko likes to eat slowly but still wants to finish eating all the bananas before the guards return.

// Return the minimum integer k such that she can eat all the bananas within h hours.

// Example 1:
// Input: piles = [3,6,7,11], h = 8
// Output: 4

// Brute force - 
// Can iterative check for each value starting from 1 to max of the array value. 
//Becasue max of array will make sure that each of the values in array can done in 1 hour of each.

public class Solution {

    // Time complexity: O(nlogM)
    // Space complexity: O(1)
    public int minEatingSpeed(int[] piles, int h) {
        int min = 1;
        int max = Arrays.stream(piles).max().getAsInt();
        int res = max;

        while(min <= max){
            int rate  = min + (max - min)/2;
            int totalTime = 0;

            for(int pile: piles){
                totalTime += Math.ceil((double)pile/rate);
            }

            if(totalTime > h){
                min = rate + 1;
            }
            else{
                res = rate;
                max = rate - 1;
            }
        }

        return res;
    }
}
