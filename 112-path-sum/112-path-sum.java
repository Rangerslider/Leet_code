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
    public boolean hasPathSum(TreeNode r, int a) {
       if (r == null)
      return false;
    if (r.val == a && r.left == null && r.right == null)
      return true;
    return hasPathSum(r.left, a - r.val) ||
           hasPathSum(r.right, a - r.val); 
    }
}