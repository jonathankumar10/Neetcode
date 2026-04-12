class Solution {
    public int removeDuplicates(int[] nums) {
        int counter = 1;
        if (nums.length == 0) {
            return 0;
        }

        for(int i = 0; i < nums.length-1; i++){
            if(nums[i] == nums[i+1]){
                nums[counter] = nums[i];
            }else{
                nums[counter] = nums[i+1];
                counter++;
            }
        }
        return counter;
    }
}