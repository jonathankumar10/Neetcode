public class Solution {
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