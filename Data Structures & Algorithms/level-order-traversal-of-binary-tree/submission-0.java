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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> ans = new ArrayList<>();

        if (root != null) {
            queue.add(root);
        }

        int level = 0;
        while (queue.size() > 0) {
            int levelLength = queue.size();
            List<Integer> innerList = new ArrayList<>();

            for (int i = 0; i < levelLength; i++) {

                TreeNode curr = queue.remove();
                innerList.add(curr.val);

                System.out.println("cuu ->" + curr.val);
                if (curr.left != null) {
                    queue.add(curr.left);
                }

                if (curr.right != null) {
                    queue.add(curr.right);
                }
                System.out.println("innerList ->" + innerList);
            }
            ans.add(innerList);

            level += 1;
        }
        System.out.println("ans ->" + ans);

        return ans;

    }
}