// Given an integer array nums, find the subarray with the largest sum, and return its sum.

class Solution {
    public int maxSubArray(int[] nums) {
        // Initialize max sum and curr sum to keep track of the maxValues
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        // Iterate through the array
        for(int num: nums){
            // If currSum is less than 0, we reset. Reason? We want don't want to add -ve values as it hurts our maxValue
            if(currSum < 0){
                currSum = 0;
            }

            // Add num to currSum
            currSum += num;

            // Keep the max of currSum and maxSum
            maxSum = Math.max(currSum, maxSum);
        }

        return maxSum;
    }
}