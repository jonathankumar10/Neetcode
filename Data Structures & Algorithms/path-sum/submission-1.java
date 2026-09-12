/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null){
            return false;
        }

        Stack<TreeNode> stack = new Stack<>();
        Stack<Integer> sum = new Stack<>();

        stack.push(root);
        sum.push(targetSum - root.val);

        while(!stack.isEmpty()){

            TreeNode node = stack.pop();
            int currSum = sum.pop();

            if(node.left == null && node.right == null && currSum == 0){
                return true;
            }


            if (node.left != null) {
                stack.push(node.left);
                sum.push(currSum - node.left.val);
            }

            if (node.right != null) {
                stack.push(node.right);
                sum.push(currSum - node.right.val);
            }

        }

        return false;
    }
}