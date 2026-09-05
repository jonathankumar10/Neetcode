/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int left = 1;
        int right = n;

        while(left <= right){
            int midpoint = left + (right - left)/2;

            if(guess(midpoint) == 0){
                return midpoint;
            }
            else if (guess(midpoint) == -1){
                right = midpoint -1;
            }
            else{
                left = midpoint +1;
            }
        }

        return -1;
    }
}