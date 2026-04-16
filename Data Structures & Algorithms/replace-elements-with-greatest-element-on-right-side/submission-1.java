class Solution {
    public int[] replaceElements(int[] nums) {
        int[] result = new int[nums.length];
        int value = -1;

        for(int i = nums.length-1; i >= 0; i--){
            result[i] = value;
            value = Math.max(value, nums[i]);
        }
        return result;
    }
}