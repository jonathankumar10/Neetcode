/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return dfs(root,p,q);   
    }

    private TreeNode dfs(TreeNode root, TreeNode p, TreeNode q){
        if(root == null || q == null || p == null){
            return null;
        }

        if(Math.max(q.val,p.val)< root.val){
            return dfs(root.left, p,q);
        }else if(Math.min(q.val,p.val)> root.val){
            return dfs(root.right,p,q);
        }
        return root;
    }
}