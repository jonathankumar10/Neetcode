// /**
//  * Definition for a binary tree node.
//  * public class TreeNode {
//  *     int val;
//  *     TreeNode left;
//  *     TreeNode right;
//  *     TreeNode() {}
//  *     TreeNode(int val) { this.val = val; }
//  *     TreeNode(int val, TreeNode left, TreeNode right) {
//  *         this.val = val;
//  *         this.left = left;
//  *         this.right = right;
//  *     }
//  * }
//  */
// class Solution {
//     public TreeNode insertIntoBST(TreeNode root, int val) {
//         if(root == null){
//             return new TreeNode(val);
//         }

//         Queue<TreeNode> queue = new LinkedList<>();
//         queue.add(root);

//         while(!queue.isEmpty()){
//             TreeNode node = queue.poll();
//             if(node.left != null && node.right != null){
//                 if(node.val < val){
//                     queue.add(node.right);
//                 } else {
//                     queue.add(node.left);
//                 }
//             } else {
//                 if(node.left == null && node.right != null){
//                     node.left = new TreeNode(val);
//                 }
//                 if(node.left != null && node.right == null){
//                     node.right = new TreeNode(val);
//                 }
//                 if(node.left == null && node.right == null){
//                     node.left = new TreeNode(val);
//                 }
//             }
//         }

//         return root;
//     }
// }



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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root == null){
            return new TreeNode(val);
        }

        TreeNode curr = root;
        while(true){
            if(curr.val < val){
                if(curr.right == null){
                    curr.right = new TreeNode(val);
                    return root;
                }
                curr = curr.right;
            }
            else {
                if(curr.left == null){
                    curr.left = new TreeNode(val);
                    return root;
                }
                curr = curr.left;
            }
        }
    }
}

