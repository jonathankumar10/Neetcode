class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[2* nums.length];

        System.out.println("len is " + ans.length);
        int n = nums.length;
        System.out.println("n is " + n);

        for (int i = 0; i < nums.length; i ++){
            ans[i] = nums[i];
            System.out.println("ans[i] is " + ans[i]);

            ans[i+n] = nums[i];
            System.out.println("ans[i+n] is " + ans[i+n]);

        }

        return ans;
    }
}