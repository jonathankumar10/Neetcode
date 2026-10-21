class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> currList = new ArrayList<>();
        backtrack(nums,target,currList,0, res);
        return res;

    }

    private void backtrack(int[] nums, int target, List<Integer> currList, int i, List<List<Integer>> res){
        if(target == 0){
            res.add(new ArrayList(currList));
            return;
        }

        if(target < 0 || i >= nums.length){
            return;
        }

        currList.add(nums[i]);
        backtrack(nums, target - nums[i], currList, i, res);
        currList.remove(currList.size() - 1);
        backtrack(nums, target, currList, i + 1, res);
    }
}
