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
    public List<Integer> rightSideView(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<Integer> ans = new ArrayList<>();

        if (root != null) {
            queue.add(root);
        }

        int level = 0;
        while (queue.size() > 0) {
            int levelLength = queue.size();

            for (int i = 0; i < levelLength; i++) {

                TreeNode curr = queue.remove();

                System.out.println("curr ->" + curr.val);

                if (curr.left != null) {
                    queue.add(curr.left);
                }

                if (curr.right != null) {
                    queue.add(curr.right);
                }

                if(i == levelLength -1){
                    ans.add(curr.val);
                }
            }
            level += 1;
        }
        System.out.println("level ->" + level);

        return ans;
    }
}