class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> dict = new HashMap<>();
        for(int i = 0; i < nums.length; i ++){
            int difference = target - nums[i];
            if (!dict.containsKey(difference)){
                dict.put(nums[i], i);
            }
            else{
                return new int[] { dict.get(difference), i };
            }
        }

        return new int[] {};
    }
}
