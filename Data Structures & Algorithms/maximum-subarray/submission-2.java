class Solution {
    public int maxSubArray(int[] nums) {
        int maxSub = Integer.MIN_VALUE;
        int currentMax = 0;
        for(int i = 0; i < nums.length; i ++){
            if(currentMax < 0){
                currentMax = 0;
            }

            currentMax = currentMax + nums[i];
            maxSub = Math.max(currentMax, maxSub);
        }
        return maxSub;
    }
}
