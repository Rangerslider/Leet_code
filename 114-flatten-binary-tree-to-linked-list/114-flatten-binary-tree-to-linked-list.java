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
    public void flatten(TreeNode root) {
      while (root != null) {
            if (root.left != null) {
                TreeNode k = root.left;
                TreeNode temp = root.left;
                while (k.right != null) k = k.right;
                k.right = root.right;
                root.right = temp;
                root.left = null;
            }
            root = root.right;
        }   
    }
}