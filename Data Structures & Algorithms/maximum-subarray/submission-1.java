class Solution {
    public int maxSubArray(int[] nums) {
        int maxSub = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i ++){
            int currentMax = 0;
            for(int j = i; j < nums.length; j++){

                System.out.println("nums[j] " +nums[j]);
                currentMax = currentMax + nums[j];
                maxSub = Math.max(maxSub, currentMax);
            }
            System.out.println("current Max " +currentMax);

        }

        System.out.println("max sub " +maxSub);
        return maxSub;
    }
}
